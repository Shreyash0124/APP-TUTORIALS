class Vehicle {
    int speed;
    int fuelCapacity;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("Car Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " L");
    }
}

class Bike extends Vehicle {
    void show() {
        System.out.println("Bike Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " L");
    }
}

class Truck extends Vehicle {
    void show() {
        System.out.println("Truck Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " L");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed = 120; c.fuelCapacity = 50;
        c.start(); c.show();

        Bike b = new Bike();
        b.speed = 80; b.fuelCapacity = 15;
        b.start(); b.show();

        Truck t = new Truck();
        t.speed = 100; t.fuelCapacity = 200;
        t.start(); t.show();
    }
}
