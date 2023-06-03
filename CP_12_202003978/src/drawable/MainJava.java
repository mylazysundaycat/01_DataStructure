package drawable;

public class MainJava {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle(10,5);
        Drawable circle = new Circle(2.5);

        rectangle.draw();
        rectangle.printInfo();

        System.out.println();
        circle.draw();
        circle.printInfo();
    }
}
