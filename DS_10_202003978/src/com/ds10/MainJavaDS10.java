package com.ds10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainJavaDS10 {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\user\\IdeaProjects\\cnu_study\\DS_10_202003978\\src\\input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            List<String> alines = new ArrayList<>();

            while((line=br.readLine())!=null) {
                alines.add(line);
            }

            while(alines.isEmpty()==false) {
                BinarySearchTree tree = new BinarySearchTree();
                String[] splited = alines.remove(0).split(" ");

                int k=Integer.valueOf(alines.remove(0));
                
                //노드 삽입
                for(int i=0; i<splited.length;i++){
                    int key=Integer.valueOf(splited[i]);
                    tree.put(key,0);
                }
                tree.inorder(tree.getRoot());
                tree.delete_kthSmallest(k);
                System.out.println();
                tree.inorder(tree.getRoot());
                System.out.println("\n= = = = = = = = = = = = =");
                
            }

        } catch(FileNotFoundException e) {

        } catch(IOException e) {

        }
    }
}
