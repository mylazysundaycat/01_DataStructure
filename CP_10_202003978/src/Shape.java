public class Shape {
    public void area() {
        System.out.println("도형의 넓이 계산");
    }

}

class Circle extends Shape {
    
    Circle() {
        System.out.println("넓이를 계산하고 싶으면 area메소드에 반지름을 넣으세요");
    }
    
    public void area(int r) {
        System.out.println("원의 넓이는 "+(r*r*3.14f));
    }
}

class Rectangle extends Shape {

    Rectangle(){
        System.out.println("넓이를 계산하고 싶으면 area 메소드에 가로와 세로 길이를 넣으세요");
    }
    public void area(int width, int length) {
        System.out.println("직사각형의 넓이는 "+(width*length));
    }
}

