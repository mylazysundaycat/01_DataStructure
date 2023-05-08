import java.util.NoSuchElementException;

public class Deque<E> {
    private DoubleLinkedList<E> list;
    private int size;

    public Deque() {
        list = null;
        size = 0;
    }

    public int size() {return size;}
    public boolean isEmpty() {return size()==0;}
    public DoubleLinkedList<E> getList() {return list;}

    //새 노드 생성하고 newitem 저장하고, 맨 앞에 새 노드를 삽입하는 메소드
    public void insertFront(E newitem) {
        if(isEmpty()) {
            DoubleLinkedList<E> dll = new DoubleLinkedList<>();
            dll.insertBefore(newitem);
            list = dll;
        } else {
            list.insertBefore(newitem);
        }
        size++;
    }

    //새 노드를 생성하고 newitem 조장하고, 맨 뒤에 새 노드를 삽입하는 메소드
    public void insertLast(E newitem) {
        if(isEmpty()) {
            DoubleLinkedList<E> dll = new DoubleLinkedList<>();
            dll.insertAfter(newitem);
            list = dll;
        } else {
            list.insertAfter(newitem);
        }
        size++;
    }

    //첫 항목을 삭제하고 삭제된 item을 반환하는 메소드
    public E deleteFront() {
        if(isEmpty()) throw new NoSuchElementException();
        E ditem = list.deleteHead();

        return ditem;
    }

    //마지막 항목을 삭제하고 삭제된 item을 반환하는 메소드
    public E deleteLast() {
        if(isEmpty()) throw new NoSuchElementException();
        E ditem = list.deleteTail();

        return ditem;
    }
}
