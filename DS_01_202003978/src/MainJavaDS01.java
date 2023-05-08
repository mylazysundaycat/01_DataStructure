import java.io.*;
import java.util.*;

public class MainJavaDS01 {
	public static void main(String[] args) throws IOException {	
			FileReader fr = new FileReader(".\\src\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//input.txt을 한 행씩 받아오도록 line 변수 생성
			String line = "";
			//파일 안에 몇 개의 숫자가 들어있는지 세기위한 size 변수 생성, 이는 배열의 사이즈와 연결됨
			int size = 0;
			//파일 안에 몇 행이 들어있는지 세기 위한 lineSize 변수 생성
			int lineSize = 0;
			
			while((line=br.readLine())!=null) {
				StringTokenizer token = new StringTokenizer(line," ");
				while(token.hasMoreTokens()) {
					++size;
					token.nextToken();
				}
				++lineSize;
			}
			
			br.close();
			
			FileReader fr2 = new FileReader(".\\src\\input.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			
			//파일 갯수만큼 배열에 저장
			int[] lineArr = new int[size];
			String line2 = "";
			
			//while문 안에서 lineArr의 인덱스역할을 하는 변수
			int lineArrIndex = 0;
			
			/* 행의 갯수를 사이즈로 갖는 int 배열을 생성한다. 여기에 개행되는 
			lineArr의 index를 저장할것이다. */
			int[] enterIndex = new int[lineSize];		
		
			// while문 안에서 enterIndex의 인덱스 역할을 하는 변수
			int index = 0;
			
			while((line2=br2.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(line2, " ");
				// 행에서 숫자가 몇개가 될 때 마다 개행되는지 기록하는 숫자
				enterIndex[index] = st.countTokens();
				index++;
				while(st.hasMoreTokens()) {
					lineArr[lineArrIndex] = Integer.parseInt(st.nextToken());
					lineArrIndex++;
				}
				
			}
						
			arrAddEvenSort(lineArr, enterIndex);
			
			int[] enterIndexAddArr = new int[enterIndex.length];
			for(int i=0; i<enterIndex.length; i++) {
				enterIndexAddArr[i] = enterIndexSum(enterIndex,i);
			}
			
			arrPrint(lineArr, enterIndexAddArr);
			
				
			br2.close();
	}
	
	
	
	//홀수짝수 구분하는 메소드, 해당 index의 처음과 끝을 설정할수 있도록 제작함
	static int[] OddEvenId(int[] lineArr, int start, int end) {
		//홀수
		ArrayList<Integer> oddNum = new ArrayList<Integer>();
		//짝수
		ArrayList<Integer> evenNum = new ArrayList<Integer>();
		
		for(int i=start; i<end; i++) {
			if(lineArr[i]%2==0) {
				evenNum.add(lineArr[i]);
			} else {
				oddNum.add(lineArr[i]);
			}
		}
		//짝수를 앞에....
		for(int i=0; i<evenNum.size(); i++) {
			lineArr[start] = evenNum.get(i);
			start++;
		}
		//홀수를 뒤에...
		for(int i=0; i<oddNum.size(); i++) {
			lineArr[start] = oddNum.get(i); 
			start++;
		}
		return lineArr;
		
	}
	
	static void arrAddEvenSort (int[] lineArr, int[] enterIndex) {
		for(int i=0; i<enterIndex.length; i++) {
			if(i==0) {
			OddEvenId(lineArr, 0, enterIndex[i] );
			} else {
			OddEvenId(lineArr, enterIndexSum(enterIndex,i-1), 
					enterIndexSum(enterIndex,i));	
			}
			
		}
	
	}
	
	
	static int enterIndexSum (int[] enterIndex, int i) {
		if(i==0) {
			return enterIndex[0];
		}
		int sum = enterIndex[0];
		for(int j=1; j<i+1; j++) {
			sum += enterIndex[j];
		}
		return sum;
	}
	
	
	
	static void arrPrint(int[] lineArr, int[] enterIndexAddArr) {
		int i = 0;
		boolean checkNum = false;
		Loop1 : while(true) {
			
			for(int j=0; j<enterIndexAddArr.length; j++) {
				if(i == enterIndexAddArr[j]-1) {
					checkNum=true;
					break;
				} else {
					checkNum=false;
					 }
			}
			
			if(checkNum) {
				System.out.println(lineArr[i]+" ");
			} else {
				System.out.print(lineArr[i]+" ");
			}

			if(i==lineArr.length-1) {
				break Loop1;
			}
			
			i++;
					
		}
		
	}
	

}