
public class MainJava3 {
	public static void main(String[] args) {
		//첫 번째 방법 중첩된 for문
		for(int i=1; i<=10; i++) {
			for(int j=10; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//repeat메소드 이용
		for(int i=1; i<=10; i++) {
			System.out.print(" ".repeat(10-i));
			System.out.print("*".repeat(i));
			System.out.println();
		}		
		
	}
}
