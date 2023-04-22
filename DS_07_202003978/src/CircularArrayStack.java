import java.util.EmptyStackException;

public class CircularArrayStack<E> {
	private E c[];
	private int count; // 배열의 크기 변수
	private int front; // 처음 입력되었던 자료 가리키는 변수
	private int top; // 마지막에 입력되었던 자료 가리키는 변수 
	
	public CircularArrayStack(int num) {
		c = (E[])new Object[num];
		count = 0; 
		front = -1;
		top = -1;
	}
	
	public boolean isEmpty() {return (count==0);}
	
	//스택의 맨 위요소를 제거하지 않고 보는 메소드
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return c[top];
	}
	
	//스택의 맨 위에 요소를 추가하는 메소드
	public void push(E newItem) {
		if(isEmpty()) {
			c[++front] = newItem;
			top++;
			count++;
		} else {
			top = (top+1)%c.length;
			c[top] = newItem;
			count++;
			//top과 front의 인덱스가 같아졌다는 것은 배열의 갯수를 초과하여 덮어쓰기 시작했다는 것 이므로, count를 추가하지 않는다.
			if(top==front) {
				front = (front+1)%c.length;
				count--;
			}
		}
		
	}
	
	//스택의 맨 위에 요소를 제거하는 메소드
	public E pop() {
		if(isEmpty()) return null;
		E popItem = c[top];
		c[top] = null;
		count--;
		//맨 위의 요소가 인덱스 0일 때 리스트의 맨 마지막 요소인 c.length-1로 돌아갈 수 있도록 조건문을 만든다.
		if(front==top) {
			front = -1;
			top =-1;
			count =0;
		} else if(top==0) {
			top = c.length-1;
		} else {
			top--;
		}
		
		return popItem;
	}
	
	public void printall(){
		if(isEmpty()) {
			System.out.print("No data");
		}else {
			for(int i=front; i<front+count; i++) {
				System.out.print(c[i%c.length]+" ");
			}
		}
	}
}
