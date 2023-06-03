package com.ds11;

public class Node<Key extends Comparable<Key>, Value> {
    public Key id;
    public Value name;
    public int height;
    public int leftsize;
    public Node left, right;

    public Key getKey(){return id;}
    public Value getValue(){return name;}
    public int getLeftsize(){return leftsize;}
    public Node getLeft(){return left;}
    public Node getRight(){return right;}
    public void setKey(Key newKey){id=newKey;}
    public void setValue(Value newValue){name=newValue;}
    public void setLeftsize(int newLeftsize){leftsize=newLeftsize;}
    public void setRight(Node newRight){right=newRight;}
    public void setLeft(Node newLeft){left=newLeft;}



    public Node(Key newId, Value newName) {
        id = newId;
        name = newName;
        height = 0;
        leftsize = 0;
        left = right = null;
    }

    public Node(Key newId, Value newName, int newHt) {
        id = newId;
        name = newName;
        height = newHt;
        leftsize = 0;
        left = right = null;

    }

}