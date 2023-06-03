package trycatch;

import java.io.FileWriter;
import java.io.IOException;

public class trycatch6 {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("메인메소드에서 해결함");
        }
    }

    public static void writeFile() throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일쓰기 실패");
    }
}
