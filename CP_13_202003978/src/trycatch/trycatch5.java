package trycatch;

public class trycatch5 {
    public static void main(String[] args) {

        try{
            System.out.println(3/0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }


    }
}
