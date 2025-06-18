interface Shape {
    double area();
}

class Circle implements Shape {
    double r;
    public Circle(double radius) {
        this.r = radius;
    }

    public double area(){
        return Math.PI * r * r;
    }
}

class Square implements Shape {
    double side;
    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(4)
        };

        for(Shape s : shapes ) {
            System.out.println(s.area());
        }
    }
}