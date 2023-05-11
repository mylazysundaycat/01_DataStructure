public class MainJavaCP08 {
    public static void main(String[] args) throws InterruptedException {
        University cnu = new University();
        System.out.println(cnu.name);


        cnu.call();

        System.out.println("================================");

        cnu.call("권예지");


    }

}
