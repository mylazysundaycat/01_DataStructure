public class T4 {
	public static void main(String[] args) {
		float r = 5.0f;
		final float PI = 3.14592f;
		
		float circleBefore = (r*r*PI);
		int circle = (int)Math.round(circleBefore);
		
	    System.out.println("2진수 변환 값: " + Integer.toString(circle, 2));
	    System.out.println("8진수 변환 값: " + Integer.toString(circle, 8));
	    System.out.println("16진수 변환 값:  " + Integer.toString(circle, 16));
	}
}
