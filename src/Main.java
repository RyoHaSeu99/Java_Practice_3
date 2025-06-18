abstract class Shape {
    abstract double area();

    public void displayArea(){
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width =width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        circle.displayArea();
        rectangle.displayArea();
    }
}