import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainJavaDS02 {
	static int seq_count =0;
	static int bin_count =0;
	
	public static void main(String[] args) {
		
		//사이즈를 n크기로 갖는 for문
		for(int n=8; n<=1024; n*=2) {
			
			//이진탐색 (0~7까지 저장된 배열)
			int[] bin_ary = new int[n];	
			
			//bin_ary에 순서대로 정수를 저장한 배열
			for(int i=0; i<n; i++) {
				bin_ary[i] = i;
			}
			
			
			//순차탐색(0~7사이의 랜덤값으로 저장된 배열)
			int[] seq_ary = new int[n];
			
			//seq_ary에 랜덤값 저장하는 for문
			for(int i=0; i<n; i++) {
				seq_ary[i] = (int)(n*Math.random());
			}
			
			
			//찾아야 하는 랜덤한 정수
			int target = (int)(n*Math.random());
			
			int seq_index = seq_search(seq_ary, target);
			int bin_index = bin_search(bin_ary, target);
			
			System.out.println("n= "+n);
			System.out.println("목표값: "+target);
			System.out.printf("순차탐색(count,index): (%d, %d)%n",
					seq_count,seq_index);
			System.out.printf("이진탐색(count,index): (%d, %d)%n",
					bin_count,bin_index);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓"
					+ "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			
		}
		
	}
	
	//순차 탐색
	public static int seq_search(int[] arr, int target) {
		//순차 탐색의 총 횟수를 저장할 class static 변수
		seq_count = 0;
		//타겟의 인덱스를 반환해줄 변수
		int index=0;
		//목표가 발견됐을때 true로 변경해서 해당 위치를 리턴할 변수
		boolean checkNum = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				index = i;
				checkNum = true;
				++seq_count;
				break;
			}
			++seq_count;
		}

		//목표가 발견됐을땐 그 위치를 리턴하고 목표가 발견되지 않으면 
		//배열의 길이(n)의 음수를 리턴한다.
		if(checkNum) {
			return index;
		} else { 
			return -arr.length;
		}
		
	}
	
	//이진 탐색
	public static int bin_search(int[] arr, int target) {
		//이진 탐색의 총 횟수를 저장할 변수
		bin_count = 0;
		//타겟의 인덱스를 반환해줄 변수
		int index = 0;
		//비교해줄 p,q
		int p = 0;
		int q = arr.length-1; //7
		//반으로 쪼개줄 i
		int i = (p+q/2); //3
		
		while(true) {
			if(arr[i]==target) { 
				index = i;
				bin_count++;
				break;
			} else if (arr[i]>target) { 
				q = i-1;
				i = (p+q)/2;
				bin_count++;
			} else if (arr[i]<target) { 
				p = i+1; 
				i = (p+q)/2;
				bin_count++;
			}
			 
		}
		return index;
	}
}

