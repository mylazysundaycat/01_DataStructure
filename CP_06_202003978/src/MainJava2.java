import java.util.Scanner;

public class MainJava2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수만 입력하세요.");
		int a = sc.nextInt();
		int num = 0;
		
		
		if(a%2==0) {
			while(a<168) {
				num++;
				a += 2;
			} 
			System.out.println("총"+num+"회 돌았습니다.");
		} else {
			System.out.println("짝수만 입력하시라구요!!!");
		}
		
		
		

	}
}
