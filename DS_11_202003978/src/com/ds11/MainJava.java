package com.ds11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\user\\IdeaProjects\\cnu_study\\DS_11_202003978\\src\\input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            List<String> alines = new ArrayList<>();

            while((line=br.readLine())!=null){
                alines.add(line);
            }

            while(alines.isEmpty()==false){
                AVLTree tree = new AVLTree();
                String[] splited = alines.remove(0).split(" ");

                int k = Integer.valueOf(alines.remove(0));

                for(int i=0; i<splited.length; i++){
                    int key = Integer.valueOf(splited[i]);
                    tree.put(key,0);
                }

                tree.preorder(tree.getRoot());
                System.out.println();
                tree.getLeftsize();
                System.out.println(tree.getRoot().getLeftsize());
                System.out.println("==========================");
                tree.kdelete(k);
                tree.preorder(tree.getRoot());
                System.out.println();
                System.out.println(tree.getRoot().getLeftsize());
                System.out.println("==========================");

            }

        } catch(FileNotFoundException e) {

        } catch(IOException e) {

        }
    }
}
