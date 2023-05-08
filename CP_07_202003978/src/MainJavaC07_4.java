
public class MainJavaC07_4 {
	public static void main(String[] args) {
	      int[][] snail = new int[5][5];
	        
	        int print = 5;
	        
	        //1~25
	        int k = 1;
	        
	        int right = -1;
	        int bottom = 0;
	        
	        //방향전환(-1)
	        int top = 1;
	        
	        for(int i=0; i<5; i++) {
	        	

	            for(int j=0; j<print; j++) {
	                right += top;
	                snail[bottom][right] = k;
	                k++;
	            }
	            
	            print--;
	            
	            for(int j=0; j<print; j++) {
	                bottom += top;
	                snail[bottom][right] = k;
	                k++;
	            }
	            
	            top = top * (-1);
	            
	            
	        }		
				
		
	        
	        
		//출력
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d",snail[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println('\u0000');
		
		
	}
}
