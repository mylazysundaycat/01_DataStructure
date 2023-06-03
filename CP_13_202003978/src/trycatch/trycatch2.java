package trycatch;

public class trycatch2 {
    public static void main(String[] args) {
        try {
            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 =>"+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
