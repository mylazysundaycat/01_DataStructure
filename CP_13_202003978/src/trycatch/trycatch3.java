package trycatch;

public class trycatch3 {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);

            int[] arr=new int[3];
            arr[5]=100;

            Object obj = "test";
            System.out.println((int)obj);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("뭔가 실수하셨네요ㅋ");
        } catch (ClassCastException e) {
            System.out.println("자바의 정석부터 다시 보시길...");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리됨");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
