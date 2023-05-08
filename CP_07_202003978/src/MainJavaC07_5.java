
public class MainJavaC07_5 {
	public static void main(String[] args) {
		int[][] snailArr = new int[5][5];
		
		//2차원 배열에 입력될 증가할 숫자
		int num = 1;
		
		//2차원 배열의 행과 열
		int bottom = 0;
		int right = -1;
		
		//2차원 배열의 방향전환을 도울 변수
		int direction = 1;
		
		//snailArr의 length를 건드릴 수 없으니 대체할 변수
		int n = 5;
		
		for(int i=0; i<snailArr.length; i++) {
			for(int j=0; j<n; j++) {
				right += direction;
				snailArr[bottom][right] = num;
				num++;
			}
			n--;
			for(int j=0; j<n; j++) {
				bottom += direction;
				snailArr[bottom][right] = num;
				num++;
			}
			direction *= -1;
		}
		
		//출력문
		for(int i=0; i<snailArr.length; i++) {
			for(int j=0; j<snailArr.length; j++) {
				System.out.printf("%3d",snailArr[i][j]);
			}
			System.out.println();
		}	
	}
}
