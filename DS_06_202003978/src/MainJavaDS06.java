import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainJavaDS06 {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(".\\src\\input.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = " ";
		List<String> alines = new ArrayList<>();
		
		while((line=br.readLine())!=null) {
				alines.add(line);		
			}

		ArrayStackDS06<String> as = new ArrayStackDS06<>();
		
			for(String e : alines) {
			
				for(int i=0; i<e.length(); i++) {
					String symbol = String.valueOf(e.charAt(i));
					
					/*
					 피연산자가 들어온 경우
					 "("를 만난 경우
					 "*+/-"가 들어온 경우
					 */
					
					//1. 피연산자가 들어온 경우
					if(getPriority(symbol)==-1) {
						System.out.print(symbol);
					} 
					//2. 띄어쓰기 처리
					else if(getPriority(symbol)==0) {
						
					}
					//3. )를 만난 경우
					else if(getPriority(symbol)==1) {
						while(getPriority(as.peek())!=2) {
							System.out.print(as.pop());
						}
						//마지막"("를 빼주는 역할
						as.pop();
					}
					//4. *+/-가 들어온 경우
					else {
						//"("인경우 그냥 바로 스택에 입력
						if(getPriority(symbol)==2) {
							as.push(symbol);
						}
						//스택이 비어있지 않고, 새 연산자가 원래 연산자보다 우선순위가 낮음
						else if(!as.isEmpty() && (getPriority(as.peek())>=getPriority(symbol))) {
							while((getPriority(as.peek())>=getPriority(symbol))) {
								System.out.print(as.pop());
								if(as.isEmpty()) break;
							}	
							as.push(symbol);
						} else {
							as.push(symbol);
						}
					}
		
				}
				
				//과정이 끝났으면 스택이 Empty 될 때까지 pop 출력
				while(!as.isEmpty()) {
						System.out.print(as.pop());
				}
				System.out.println();
			}
			
			br.close();
			
		}

	public static int getPriority(String symbol) {
		switch(symbol) {
			case "*":
			case "/":
				return 4;
			case "+":
			case "-":
				return 3;
			case "(":
				return 2;
			case ")":
				return 1;
			case " ":
				return 0;
		}
		return -1;
	}
}
