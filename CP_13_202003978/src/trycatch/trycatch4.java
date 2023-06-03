package trycatch;

public class trycatch4 {
    public static void main(String[] args) {
        try{
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        } catch(Exception e) {
            System.out.println("문제 발생!:"+e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }
    }
}
