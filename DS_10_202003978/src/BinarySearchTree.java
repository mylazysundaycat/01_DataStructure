import java.util.LinkedList;
import java.util.Queue;

//이진 탐색 트리를 위한 BST 클래스
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    public Node root;
    public Node getRoot(){return root;}
    public Key saveId;
    public int testNum;

    public BinarySearchTree() {
        root = null;
        saveId = null;
        testNum=0;
    }
    public BinarySearchTree(Key newId, Value newName){
        root = new Node(newId,newName);
        saveId = null;
        testNum=0;
    }
    
    //중위순회
    public void inorder(Node n) {
        if(n!=null){
            inorder(n.getLeft());
            System.out.print(n.getKey()+" ");
            inorder(n.getRight());

        }
    }

    //@@@@@@@@@@@@완성@@@@@@@@@@@@@
    public void inorder(Node n, int k) {
        if(n!=null){
            inorder(n.getLeft(),k);
            testNum++;
            if(testNum==(k)) saveId = (Key)n.getKey();
            inorder(n.getRight(),k);

        }
    }

    public void delete_kthSmallest(int k) {
        if(root==null) System.out.println("empty 트리");
        delete_kthSmallest(k, getRoot());
    }
    public void delete_kthSmallest(int k, Node n) {
        inorder(n, k);
        delete(saveId);
    }

    //탐색 연산
    public Value get(Key k){return get(root, k);}
    public Value get(Node n, Key k){
        if(n==null) return null;
        int t = n.getKey().compareTo(k);
        if(t>0) return get(n.getLeft(),k);
        else if(t<0) return get(n.getRight(), k);
        else return (Value)n.getValue();
    }

    //삽입 연산
    public void put(Key k, Value v) {root=put(root, k, v);}
    public Node put(Node n, Key k, Value v) {
        if(n==null) return new Node(k,v);

        int t=n.getKey().compareTo(k);

        if(t>0) n.setLeft(put(n.getLeft(),k,v));
        else if(t<0) n.setRight(put(n.getRight(),k,v));
        else n.setValue(v);

        return n;
    }

    //최솟값 찾기
    public Key min() {
        if(root==null) return null;

        return (Key)min(root).getKey();
    }

    private Node min(Node n){
        if(n.getLeft()==null) return n;
        return min(n.getLeft());
    }

    //최솟값 삭제
    public void deleteMin(){
        if(root==null) System.out.println("empty 트리");
        root=deleteMin(root);
    }

    public Node deleteMin(Node n){
        if(n.getLeft()==null) return n.getRight();
        n.setLeft(deleteMin(n.getLeft()));
        return n;
    }

    //삭제 연산
    public void delete(Key k){root=delete(root,k);}
    public Node delete(Node n,Key k){
        if(n==null) return null;
        int t=n.getKey().compareTo(k);
        if(t>0) n.setLeft(delete(n.getLeft(),k));
        else if(t<0) n.setRight(delete(n.getRight(),k));
        else {
            if(n.getRight()==null) return n.getLeft(); //case 0,1
            if(n.getLeft()==null) return n.getRight(); //case 1
            Node target=n; //case 2 (아래 라인 3줄까지 포함)
            n=min(target.getRight());
            n.setRight(deleteMin(target.getRight()));
            n.setLeft(target.getLeft());
        }
        return n;
    }
}

class Node<Key extends Comparable<Key>, Value> {
    private Key id; //비교연산을 위해서 Comparable 인터페이스를 상속받는다.
    private Value name;
    private Node left, right;
    public Node(Key newId, Value newName) {
        id=newId;
        name=newName;
        left=right=null;
    }

    public Key getKey(){return id;}
    public Value getValue(){return name;}
    public Node getLeft(){return left;}
    public Node getRight(){return right;}
    public void setKey(Key newId){id=newId;}
    public void setValue(Value newName){name=newName;}
    public void setLeft(Node newLeft){left=newLeft;}
    public void setRight(Node newRight){right=newRight;}

}



