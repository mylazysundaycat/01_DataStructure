
public class SinglyLinkedList {
	int size;
	String save_num;
	String compare_num;
	Node head;
	Node pointer;
	
	
	class Node {
		private int data;
		private Node next;
		
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		
		Node getNext() {
			return next;
		}
		void setNext(Node next) {
			this.next = next;
		}
		
		int getData() {
			return data;
		}
		void setData(int data) {
			this.data = data;
		}
	}
	
	SinglyLinkedList(){
		this.size =0;
		this.head =null;
		this.pointer =null;
		this.save_num = "";
		this.compare_num = "";
	}
	
	
	void insertnumber(int number) {
		String x = Integer.toString(number);
		StringBuffer sb = new StringBuffer(x);
		x = sb.reverse().toString();
		String[] num = x.split("");
		
		Node result = null;
		Node resultP = null;
		
		for(int i=0; i<num.length; i++) {
			if(head==null) {
				head = new Node(Integer.parseInt(num[i]),null);
				pointer = new Node(Integer.parseInt(num[i]),null);
				size++;
			} else if(head.getNext()==null){
				head.setNext(new Node(Integer.parseInt(num[i]),null));
				pointer.setNext(new Node(Integer.parseInt(num[i]),null));
				size++;
				result = head.getNext();
				resultP = pointer.getNext();
			} else {
				result.setNext(new Node(Integer.parseInt(num[i]), null));
				resultP.setNext(new Node(Integer.parseInt(num[i]), null));
				result = result.getNext();
				resultP = resultP.getNext();
				size++;
			}
		}	
		
	}
	
	void add(SinglyLinkedList otherNumber) {
		String pointerNum = "";
		if(save_num=="") {
			pointerNum = printnumber();	
		} else {
			pointerNum = save_num;
		}
		
		String otherNum = "";
		if(otherNumber.save_num=="") {
			otherNum = otherNumber.printnumber();	
		} else {
			otherNum = otherNumber.save_num;
		}
		int sum = Integer.parseInt(pointerNum)+Integer.parseInt(otherNum);
		head = null;
		pointer = null;
		insertnumber(sum);
	}
	
	String printnumber() {
			if(head==null&&compare_num.equals(save_num.substring(0,compare_num.length()))) {
			save_num = save_num.substring(compare_num.length(),save_num.length());
			head = pointer;
			StringBuffer sb = new StringBuffer(save_num);
			
			save_num = sb.reverse().toString();
			compare_num = save_num;
			
			return save_num;
		} else if(head==null) {
			head = pointer;
			StringBuffer sb = new StringBuffer(save_num);
			
			save_num = sb.reverse().toString();
			compare_num = save_num;
			return save_num;
		}
		save_num += head.getData();
		head = head.getNext();
		return printnumber();
	}
	
}
