import java.util.NoSuchElementException;

public class DoubleLinkedList<E> {
    DNode<E> head, tail;
    int size;


    public DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int size() {return size;}
    public Boolean isEmpty() {return size==0;}

    //앞에 삽입
    public void insertBefore(E newitem) {
        if(head == null) {
            DNode<E> d = new DNode<E>(newitem);
            head.setPrev(d);
            head = d;
        } else {
            DNode<E> d = new DNode<E>(newitem);
            d.setNext(head);
            d.setPrev(head.getPrev());
            head.setPrev(d);
            head = d;
        }
        size++;
    }

    //뒤에 삽입
    public void insertAfter(E newitem) {
        if(size() == 0 || tail == null) {
            DNode<E> d = new DNode<E>(newitem);
            head = d;
            tail = d;

        } else {
            DNode<E> d = new DNode<E>(newitem);
            tail.setNext(d);
            d.setPrev(tail);
            tail = d;
        }
        size++;
    }

    public E deleteHead() {
        if(size==0) throw new NoSuchElementException();
        E ditem = head.getItem();
        DNode<E> r = head.getNext();
        r.setPrev(null);
        head = r;
        size--;
        if(size==1) {
            tail = head;
        }
        return ditem;
    }

    public E deleteTail() {
        if(size==0) return null;
        if(size==1) {
            E ditem = tail.getItem();
            DNode<E> f = tail.getPrev();
            head = tail = null;
            size--;
            return ditem;
        } else {
            E ditem = tail.getItem();
            DNode<E> f = tail.getPrev();
            f.setNext(null);
            tail = f;
            size--;
            return ditem;
        }
    }
}

class DNode<E> {
    private E item;
    private DNode<E> prev;
    private DNode<E> next;

    DNode(E newitem) {
        this.item = newitem;
        this.prev = null;
        this.next = null;
    }

    DNode(E newitem, DNode<E> p, DNode<E> q){
        this.item = newitem;
        this.prev = p;
        this.next = q;
    }
    public E getItem() {return item;}
    public DNode<E> getPrev() {return prev;}
    public DNode<E> getNext() {return next;}
    public void setItem(E newitem) {item=newitem;}
    public void setPrev(DNode<E> p) {prev=p;}
    public void setNext(DNode<E> q) {next=q;}
}
