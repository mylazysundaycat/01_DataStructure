package drawable;

public class Rectangle implements Drawable {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }

    @Override
    public void printInfo() {
        System.out.printf("사각형의 가로 길이: %d\n사각형의 세로 길이: %d\n",width,height);
    }
}
