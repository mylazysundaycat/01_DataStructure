package CP_13;

public class Division {
    public void divide(int a, int b){
        try {
            if(b==0){
                throw new DivisionByZeroException("DivisionByZeroException!");
            } else {
                System.out.printf("%d 나누기 %d는 %d입니다.\n",a,b,a/b);
            }
        } catch (DivisionByZeroException e) {
            System.out.println("두번째 값에 0을 입력하지 마시오.");
        } finally {
            System.out.println("finally block executed");
        }

    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String msg) {
        super(msg);
    }

}