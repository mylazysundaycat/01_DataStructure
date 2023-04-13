import java.util.Scanner;

public class MainJava {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		do {
			System.out.println("짝수만 입력하세요");
			a = sc.nextInt();
		} while(a%2!=0);
		
		int num = 0;
		
		do{
			a += 2;
			num ++;
		} while(a<168);
		
		System.out.println("총 "+num+"번 돌았습니다.");

	}
}
