class Car {
    String brand, model;
    int year;

    void start() {
        System.out.println("Car is starting...");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Tesla";
        c.model = "Model 3";
        c.year = 2025;
        c.start();
    }
}
