package drawable;

public class Circle implements Drawable{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }

    @Override
    public void printInfo() {
        System.out.printf("원의 반지름: %f\n",radius);
    }
}
