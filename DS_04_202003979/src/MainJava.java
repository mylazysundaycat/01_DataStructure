import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainJava {
	//input 파일을 받고 요소를 출력해줄 메소드
	static void fileManage(String fileDir) throws IOException {
		FileReader fr = new FileReader(fileDir);
		BufferedReader br = new BufferedReader(fr);
		SinglyLinkedList sll = new SinglyLinkedList();
		
		String line = "";
		//첫 줄은 firsthead, 두 번째 줄은 secondhead에 넣어줄 변수
		int lineNum = 0;
		
		while((line=br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(line," ");
			int count = st.countTokens();
			lineNum++;
			for(int i=0; i<count; i++) {
				sll.insertLast(Integer.parseInt(st.nextToken()),lineNum);
			}
		}
		
		sll.printAll();
		sll.merge();
		sll.printAll();
		System.out.println();
		br.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		fileManage(".\\src\\input.txt");
	}
}


