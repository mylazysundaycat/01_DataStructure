public class SinglyLinkedList {	
	//Node 클래스
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
	
	Node firsthead;
	Node secondhead;
	
	int size1;
	int size2;
	int count;
	
	//초기화
	SinglyLinkedList() {
		this.firsthead = null;
		this.secondhead = null;
		this.size1 = 0;
		this.size2 = 0;
		this.count = 0;
	}

	//x를 i번째 리스트의 마지막 노드로 삽입하는 메소드(오름차순)
	void insertLast(int x, int index) {
		//첫번째 노드
		if(index==1) {
			Node linkNode = firsthead;
			//헤드 노드		
			if(firsthead==null) {
				firsthead = new Node(x, null);
				size1++;
			} else {
					//헤드 다음 노드
					for(int i=0; i<size1-1; i++) {
						linkNode = linkNode.getNext();
					}
					linkNode.setNext(new Node(x,null));
					size1++;				
				}	
			
		//두번째 노드
		} else if(index==2) {
			Node linkNode = secondhead;
			//헤드 노드		
			if(secondhead==null) {
				secondhead = new Node(x, null);
				size2++;
			} else {
					//헤드 다음 노드
					for(int i=0; i<size2-1; i++) {
						linkNode = linkNode.getNext();
					}
					linkNode.setNext(new Node(x,null));
					size2++;	
			}			
		}

			
	}
	
	void merge() {
		Node resulthead = null;
		Node result = null;
		
		Node temp = firsthead;

		//firsthead 남은 크기만큼 count에 더해줄 숫자
		int saveSize1 = size1;
		

		//노드 비교후 resulthead에 대입
		if(temp.getData()>secondhead.getData()) {
			resulthead = secondhead;
			secondhead = secondhead.getNext();
			size2--;
			count++;
		} else if (temp.getData()==secondhead.getData()) {
			resulthead = secondhead;
			secondhead = resulthead.getNext();
			temp = firsthead.getNext();
			saveSize1--;
			size2--;
			count++;
		} else {
			resulthead = temp;
			temp = firsthead.getNext();
			count++;
			saveSize1--;
		}
		
		result = resulthead;
		
		
		
		//두 번째 노드
		for(int i=0; i<count; i++) {
			if(temp.getData()>secondhead.getData()) {
				resulthead.setNext(secondhead);
				resulthead = resulthead.getNext();
				if(secondhead.getNext()!=null) {
					count++;
					size2--;
					secondhead = secondhead.getNext();
				} else {
					count++;
					size2--;
					count = count + saveSize1;
					secondhead = secondhead.getNext();
					resulthead.setNext(temp);
					break;
				}
			} else if(temp.getData()==secondhead.getData()) {
				resulthead.setNext(secondhead);
				resulthead = resulthead.getNext();
				temp = temp.getNext();
				saveSize1--;
				count++;
				size2--;
				if(secondhead.getNext()!=null) {
					secondhead = secondhead.getNext();
				} else {
					count = count + saveSize1;
					secondhead = secondhead.getNext();
					resulthead.setNext(temp);
					break;
				}
			} else {
				resulthead.setNext(temp);
				resulthead = resulthead.getNext();
				saveSize1--;
				count++;
				if(temp.getNext()!=null) {
					temp = temp.getNext();
				} else {
					count += size2;
					size2 -= size2;
					resulthead.setNext(secondhead);
					secondhead = secondhead.getNext();
					break;
				}
			}
		}	
		
		firsthead = result;
		size1 = count;
	}
	
	//firsthead의 연결 리스트의 값을 출력
	void printAll() {
		Node p = firsthead;
		if(firsthead==null) {
			System.out.println("출력할 요소가 없습니다!");
		} else {
			for(int i=0; i<size1; i++) {
				System.out.print(p.getData()+" ");
				p = p.getNext();
			}
		}
		System.out.println(", firsthead의 크기는 : "+size1);
		
		p = secondhead;
		if(secondhead==null) {
			System.out.println(" ");
		} else {
			for(int i=0; i<size2; i++) {
				System.out.print(p.getData()+" ");
				p = p.getNext();
			}
		}
		System.out.println(", secondhead의 크기는 : "+size2);
		System.out.println("count : "+count);
		System.out.println("===========================================================");	
	}
}
