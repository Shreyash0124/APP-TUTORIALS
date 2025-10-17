class Circle {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5.0;
        System.out.println("Area of Circle: " + c.calculateArea());
    }
}
