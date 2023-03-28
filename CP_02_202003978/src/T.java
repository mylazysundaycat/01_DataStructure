public class T {
	public static void main(String[] args) {
		
		long num1 = 10000000000L;
		System.out.println(num1);
		
		float num2=12.34f;
		System.out.println(num2);
		
		System.out.println("2진수 변환 값: " + Integer.toString((int)(5*5*3.141592), 2));
		System.out.println("8진수 변환 값: " + Integer.toString((int)(5*5*3.141592), 8));
		System.out.println("16진수 변환 값: " + Integer.toString((int)(5*5*3.141592), 16));
		
	}
}
