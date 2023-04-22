import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainJava {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(".\\src\\input.txt");
		BufferedReader br  = new BufferedReader(fr);
		
		String line = "";
		List<String> alines = new ArrayList<>();
		
		while((line=br.readLine())!=null) {
			alines.add(line);
		}
		
		
		System.out.println("======================================");
		for(String e: alines) {
			String[] word = e.split(" ");
			CircularArrayStack<String> cas = new CircularArrayStack<>(5);
			for(int i=0; i<word.length; i++) {
				if(word[i].equals("U")) {
					cas.pop();
				} else {
					cas.push(word[i]);
				}
				cas.printall();
				System.out.println();
			}
			System.out.println("======================================");
			
		}
	}
	
}
