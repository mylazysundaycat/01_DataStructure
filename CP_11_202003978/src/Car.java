public class Car {
    String model;
    int maxDistance;

    public Car(){
        this.model = "";
        this.maxDistance = 0;
    }

    public Car(String model, int maxDistance) {
        this.model = model;
        this.maxDistance = maxDistance;
    }

    public void calculateRange() {
        System.out.println(this.model+" 의 최대 주행거리는 "+this.maxDistance+" 입니다.");
    }
}
