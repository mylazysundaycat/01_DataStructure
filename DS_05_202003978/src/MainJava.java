import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class MainJava {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FileReader fr = new FileReader(".\\src\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		SinglyLinkedList list1 = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list1.insertnumber(br.readLine());
		System.out.println(list1.printnumber());
		
		list2.insertnumber(br.readLine());
		System.out.println(list2.printnumber());
		
		list1.add(list2);
		System.out.println(list1.printnumber());
		
		br.close();
		
		
	}
}
