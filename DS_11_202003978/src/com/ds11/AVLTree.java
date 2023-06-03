package com.ds11;

public class AVLTree<Key extends Comparable<Key>, Value> {
    public Node root;
    public Node getRoot() {return root;}
    int k;
    int testNum;
    Key saveId;
    public AVLTree() {
        root = null;
        k = 0;
        testNum = 0;
        saveId = null;
    }
    public AVLTree(Key newId, Value newName){
        root = new Node (newId, newName);
        k = 0;
        testNum = 0;
        saveId = null;
    }

    //전위순회
    public void preorder(Node n) {
        if(n!=null){
            System.out.print(n.getKey()+" ");
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }

    public void inorder(Node n) {
        if(n!=null){
            inorder(n.getLeft());
            System.out.print(n.getKey()+" ");
            inorder(n.getRight());

        }
    }
    //왼쪽으로 회전
    private Node rotateLeft(Node n) {
        Node x=n.right;
        n.right=x.left;
        x.left=n;

        n.height=Math.max(height(n.left),height(n.right))+1;
        x.height=Math.max(height(x.left),height(x.right))+1;
        return x;
    }

    //오른쪽으로 회전
    private Node rotateRight(Node n) {
        Node x=n.left;
        n.left=x.right;
        x.right=n;
        n.height = Math.max(height(n.left),height(n.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;
        return x;
    }

    public int height(Node n) {
        if(n==null) return 0;
        else return (1+Math.max(height(n.right),height(n.left)));
    }
    
    //삽입 연산
    public void put(Key k, Value v) {root=put(root, k, v);}
    private Node put(Node n, Key k, Value v) {
        if(n==null) return new Node(k, v, 1);
        int t = k.compareTo((Key)n.getKey());

        if(t<0) n.setLeft(put(n.getLeft(),k,v));
        else if(t>0) n.setRight(put(n.getRight(),k,v));
        else {
            n.setValue(v);
            return n;
        }
        n.height = Math.max(height(n.getLeft()), height(n.getRight()))+1;
        return balance(n);
    }

    private Node balance(Node n) {
        //노드 n의 왼쪽 서브트리가 높음
        if(bf(n)>1) {
            //왼쪽 자식의 오른쪽 서브트리가 높음
            if(bf(n.getLeft())<0) {
                n.setLeft(rotateLeft(n.getLeft()));
            }
            n = rotateRight(n);
        } else if(bf(n)<-1) {
            if(bf(n.right)>0){
                n.setRight(rotateRight(n.getRight()));
            }
            n=rotateLeft(n);
        }
        return n;
    }

    //노드n의 [왼쪽 서브트리 높이 - 오른쪽 서브트리 높이] 반환하는 메소드
    private int bf(Node n) {
        return height(n.left)-height(n.right);
    }

    public int size(Node n) {
        if(n==null) return 0;
        else return (1+size(n.getLeft()))+size(n.getRight());
    }
    
    //노드의 왼쪽서브트리의 크기를 구함
    public void getLeftsize() {
        root.setLeftsize(size(getRoot().getLeft()));
    }

    public void inorder(Node n, int k) {
        if(n!=null){
            inorder(n.getLeft(),k);
            testNum++;
            if(testNum==(k)) saveId = (Key)n.getKey();
            inorder(n.getRight(),k);
        }
    }

    //kdelete
    public void kdelete(int k){
        if(root==null){
            System.out.println("empty Tree");
        }
        inorder(getRoot(), k);
        root = kdelete(root, saveId);
        getLeftsize();
    }

    public Node kdelete(Node n, Key k){
        if(n==null) return null;
        int t=n.getKey().compareTo(k);
        if(t>0) n.setLeft(kdelete(n.getLeft(),k));
        else if(t<0) n.setRight(kdelete(n.getRight(),k));
        else {
            if(n.getRight()==null) return n.getLeft();
            if(n.getLeft()==null) return n.getRight();
            Node target=n;
            n=min(target.getRight());
            n.setRight(deleteMin(target.getRight()));
            n.setLeft(target.getLeft());
        }
        return balance(n);
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




}


