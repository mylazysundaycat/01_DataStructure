package com.ds09;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>> {
    private Node<Key> root;
    public BinaryTree() {root=null;}
    public BinaryTree(Node root) {this.root=root;}
    public Node<Key> getRoot() {return root;}
    public void setRoot(Node newRoot) {root=newRoot;}
    public boolean isEmpty() {return root==null;}

    //preorder() inorder() postorder() levelorder()
    //size() height() isEqual() 메소드 선언

    //preorder
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
    public void postorder(Node n) {
        if(n!=null) {
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.print(n.getKey()+" ");
        }
    }

    public void levelorder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        Node t;
        q.add(root);
        while(!q.isEmpty()) {
            t=q.remove();
            System.out.print(t.getKey()+" ");
            if(t.getLeft()!=null) q.add(t.getLeft());
            if(t.getRight()!=null) q.add(t.getRight());
        }
    }

    public int size(Node n) {
        if(n==null) return 0;
        else return (1+size(n.getLeft()))+size(n.getRight());
    }

    public int height(Node n) {
        if(n==null) return 0;
        else return (1+Math.max(height(n.getLeft()),height(n.getRight())));
    }
    //numleaves 재귀메소드 이용해서 풀이...
    public int numleaves(Node n) {
        if (n.getLeft() == null && n.getLeft() == null) return 1;
        else return numleaves(n.getLeft()) + numleaves(n.getRight());
    }

    //pathlength 재귀 메소드 이용해서 풀이..
    public int pathlength(Node n, int length) {
        if(n==null) {
            return 0;
        } else {
            return length+pathlength(n.getLeft(),length+1)+
                    pathlength(n.getRight(),length+1);
        }

    }


    public static boolean isEqual(Node n, Node m) {
        if(n==null || m==null) return n==m;
        if(n.getKey().compareTo(m.getKey()) != 0) return false;
        return (isEqual(n.getLeft(), m.getLeft()) && isEqual(n.getRight(), m.getRight()));
    }
}
