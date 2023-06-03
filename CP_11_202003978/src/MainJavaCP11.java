import java.util.Scanner;

public class MainJavaCP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("전기 자동차의 모델명을 입력하세요:");
        String car1 = sc.nextLine();
        System.out.println("전기 자동차의 최대 주행거리를 입력하세요:");
        String km1 = sc.nextLine();
        int kmNum1 = Integer.parseInt(km1);
        ElectricCar ec = new ElectricCar(car1, kmNum1);
        ec.calculateRange();


        System.out.println("가솔린 자동차의 모델명을 입력하세요:");
        String car2 = sc.nextLine();
        System.out.println("가솔린 자동차의 최대 주행거리를 입력하세요:");
        String km2 = sc.nextLine();
        int kmNum2 = Integer.parseInt(km2);
        CasolineCar cc = new CasolineCar(car2, kmNum2);
        cc.calculateRange();


    }
}
