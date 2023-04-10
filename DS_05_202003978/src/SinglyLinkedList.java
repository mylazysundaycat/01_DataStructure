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
		this.head = null;
		this.pointer =null;
		this.save_num = "";
		this.compare_num = "";
	}
	
	
	void insertnumber(String s) {
		StringBuffer sb = new StringBuffer(s);
		String x = sb.reverse().toString();
		String[] num = x.split("");
		
		Node result = null;
		Node resultP = null;
		
		for(int i=0; i<num.length; i++) {
			if(head==null) {
				head = new Node(Integer.parseInt(num[i]),null);
				pointer = new Node(Integer.parseInt(num[i]),null);
				result = head;
				resultP = pointer;
				size++;
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
		pointerNum = printnumber();	

		String otherNum = "";
		otherNum = otherNumber.printnumber();	

		String[] num1 = pointerNum.split("");
		String[] num2 = otherNum.split("");
		String sum = "";
		int sol = 0;
	
		int i = num1.length-1;
		int j = num2.length-1;
		
		int max = Math.max(i, j)+1;
		int min = Math.min(i, j)+1;
		
		int carry = 0;

		while(min>0) {
			
			if((Integer.parseInt(num1[i])+Integer.parseInt(num2[j])+carry)>=10) {
				sol = (Integer.parseInt(num1[i])+Integer.parseInt(num2[j]) + carry)%10;
				sum += String.valueOf(sol);
				carry = 1;				
			} else if((Integer.parseInt(num1[i])+Integer.parseInt(num2[j])+carry)<10) {
				sol = (Integer.parseInt(num1[i])+Integer.parseInt(num2[j])+carry)%10;
				sum += String.valueOf(sol);
				carry = 0;	
			}
					
			i--;
			j--;
			min--;
			max--;
			
			if(min==0&&max==0&&carry==1) {
				sum +=1;
			}
		}
		
		while(max>0) {
			if((Integer.parseInt(num1[i])+carry)>=10) {
				sol = (Integer.parseInt(num1[i])+carry)%10;
				sum += String.valueOf(sol);
				carry = 1;				
			} else if((Integer.parseInt(num1[i])+carry)<10) {
				sol = (Integer.parseInt(num1[i])+carry)%10;
				sum += String.valueOf(sol);
				carry = 0;	
			}
			
			i--;
			max--;
			
			if(max==0&&carry==1) {
				sum +=1;
			}
		}
			
		
		StringBuffer sb = new StringBuffer(sum);
		String x = sb.reverse().toString();
		
		head = null;
		pointer = null;
		
		insertnumber(x);
	}
	
	String printnumber() {
		if(pointer==null&&compare_num.equals(save_num.substring(0,compare_num.length()))) {
			save_num = save_num.substring(compare_num.length(),save_num.length());
			pointer = head;
			StringBuffer sb = new StringBuffer(save_num);
			
			save_num = sb.reverse().toString();
			compare_num = save_num;
			
			return save_num;
		} else if(pointer==null) {
			pointer = head;
			StringBuffer sb = new StringBuffer(save_num);
			save_num = sb.reverse().toString();
			compare_num = save_num;
			return save_num;
		}
		save_num += pointer.getData();
		pointer = pointer.getNext();
		return printnumber();
	}
	
}
