public class Test {
	public static void main(String[] args) {
		
		int num = 123;
		
		String num2Str = Integer.toString(num,2);
		String num3Str = Integer.toString(num,3);
		String num8Str = Integer.toString(num,8);
		String num16Str = Integer.toString(num,16);
		
		System.out.println(num2Str);
		System.out.println(num3Str);
		System.out.println(num8Str);
		System.out.println(num16Str);
		
		int num2 = Integer.parseInt(num2Str,2);
		int num3 = Integer.parseInt(num3Str,3);
		int num8 = Integer.parseInt(num8Str,8);
		int num16 = Integer.parseInt(num16Str,16);
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num8);
		System.out.println(num16);
		
	}
}
