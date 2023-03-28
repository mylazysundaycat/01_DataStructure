import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainJava {
	//input 파일을 받고 요소를 출력해줄 메소드
	static void fileManage(String fileDir) throws IOException {
		FileReader fr = new FileReader(fileDir);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		int lineNum = 0;
		
		while((line=br.readLine())!=null) {
			SinglyLinkedList sll = new SinglyLinkedList();
			lineNum++;
			StringTokenizer st = new StringTokenizer(line," ");
			System.out.printf("[%d번째 줄 리스트]\n",lineNum);
			while(st.hasMoreTokens()) {
				int i = Integer.parseInt(st.nextToken());
				sll.insert(i);
				System.out.printf("size: %d | ",sll.size);
				sll.print();
				System.out.println();
			}
			System.out.println("= = = = = = = = = = = = = = = = =");
		}
		br.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		fileManage(".\\src\\input.txt");
		
	}
}


