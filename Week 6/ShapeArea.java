class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4, breadth = 6;
    double area() {
        return length * breadth;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        System.out.println("Circle Area: " + s1.area());

        Shape s2 = new Rectangle();
        System.out.println("Rectangle Area: " + s2.area());
    }
}
