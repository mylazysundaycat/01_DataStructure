import java.util.Scanner;

public class MainJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 1. 조건 사용하지않을경우 감점
		 (-1000<=x<=1000)
		 
		 2. 느낀점이 3줄요약보다 짧으면 감점
		 
		 3.마지막에 몇분면에 있습니다 출력..
		 
		 */
		
		int x = 0;
		int y = 0;
		
		do {
		System.out.println("x값을 입력하세요:");
		x = sc.nextInt();
		} while(x<-1000 || x>1000 || x==0);
		
		do {
		System.out.println("y값을 입력하세요:");
		y = sc.nextInt();
		} while(y<-1000 || y>1000 || y==0);
		
		
		if(x>0 && y>0) {
			System.out.printf("(%d,%d)는 제 1사분면에 있습니다",x,y);
		} else if(x<0 && y>0) {
			System.out.printf("(%d,%d)는 제 2사분면에 있습니다",x,y);
		} else if(x>0 && y<0) {
			System.out.printf("(%d,%d)는 제 4사분면에 있습니다",x,y);
		} else if(x<0 && y<0) {
			System.out.printf("(%d,%d)는 제 3사분면에 있습니다",x,y);
		}
	}
}
