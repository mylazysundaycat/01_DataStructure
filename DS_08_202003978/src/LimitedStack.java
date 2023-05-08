import java.util.NoSuchElementException;

public class LimitedStack<E> {
    private Deque<E> deque;
    int capacity;

    public LimitedStack(int num) {
        this.deque = new Deque<E>();
        this.capacity = num;
    }

    public E peek() {
        if(deque.isEmpty()) throw new NoSuchElementException();

        return deque.getList().head.getItem();
    }

    public void push(E newitem) {
        if(newitem.equals("U")) {
            if(deque.isEmpty() || capacity==5) {
            } else {
                deque.deleteLast();
                capacity++;
            }
        } else if (capacity==0) {
            deque.deleteFront();
            deque.insertLast(newitem);
        } else {
            deque.insertLast(newitem);
            capacity--;
        }
    }

    public E pop() {
        if(deque.isEmpty()) throw new NoSuchElementException();
        return deque.deleteLast();
    }

    public void printall() {
        if(deque.isEmpty()) {

        } else {
            DNode<E> p = deque.getList().head;
            for(int j=0; j<deque.size(); j++) {
                if(p==null) break;
                E item = (E)p.getItem();
                System.out.print(item+" ");
                p = p.getNext();
            }
        }

    }

}
