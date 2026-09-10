class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Rectangle Area: " + result);
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 5);

        s1.area();
        s2.area();
    }
}