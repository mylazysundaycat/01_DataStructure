import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainJavaDS05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FileReader fr = new FileReader(".\\src\\input.txt");
		BufferedReader br = new BufferedReader(fr);


		SinglyLinkedListDS05 list1 = new SinglyLinkedListDS05();
		SinglyLinkedListDS05 list2 = new SinglyLinkedListDS05();
		
		list1.insertnumber(br.readLine());
		System.out.println(list1.printnumber());
		
		list2.insertnumber(br.readLine());
		System.out.println(list2.printnumber());
		
		list1.add(list2);
		System.out.println(list1.printnumber());
		
		br.close();
		
		
	}
}
