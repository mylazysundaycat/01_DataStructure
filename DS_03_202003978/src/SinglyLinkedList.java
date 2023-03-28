public class SinglyLinkedList {	
	int size;
	Node start;		
	
	class Node {
		private int data;
		private Node next;
		
		Node(int data, Node next) {
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
	
	SinglyLinkedList() {
		this.size = 0;
		this.start = null;
	}

	//x를 list에 내림차순으로 삽입
	void insert(int x) {
		/*
		 1. 요소가 아무것도 없다면(start==null) start에 요소를 삽입해줄 것.
		 2. 두 번째 요소가 들어올때 부턴 내림차순으로 노드를 연결해야하기 떄문에
		 원래 있던 요소들을 <탐색>하고 <비교>후에 삽입위치를 정한다.
		 */
		//조건문에 사용되는 start 객체
		Node startStorage = start;
		//조건문이 돌아갈때 이전 노드를 저장하기 위한 객체
		Node linkNode = start;
		
		if(start==null) {
			//요소가 아무것도 없다면, start에 요소 삽입
			start = new Node(x, start);
			size++;
		} else {
			for(int i=0; i<size; i++) {
				
				//첫 번째 요소가 받은 데이터보다 크거나 같을때
				if(x>=startStorage.getData() && i==0) {
					start = new Node(x, start);
					size++;
					break;
				//두 번째 요소부터 받은 데이터보다 클 때
				} else if(x>=startStorage.getData()) {
					linkNode.setNext(new Node(x, linkNode.getNext()));
					size++;
					break;
				} 
				//받은 요소가 연결리스트의 인덱스 요소보다 작을 때 && 마지막에 들어갈 때
				else {
					if(startStorage.getNext()==null) {
						startStorage.setNext(new Node(x, startStorage.getNext()));
						size++;
						break;
					}
					linkNode = startStorage;
					//i가 커지며 반복문이 진행될 때 다음 노드로 진행시켜주는 요소
					startStorage = startStorage.getNext();
					
				}	
			}
		}
	}
	
	//연결 리스트의 값을 출력
	void print() {
		Node p = start;
		if(start==null) {
			System.out.println("출력할 요소가 없습니다!");
		} else {
			for(int i=0; i<size; i++) {
				System.out.print(p.getData()+" ");
				p = p.getNext();
			}
		}
		
	}
}
