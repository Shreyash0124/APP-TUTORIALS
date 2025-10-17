class Vehicle {
    void speed() {
        System.out.println("Vehicle speed varies.");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car runs at 100 km/h");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike runs at 80 km/h");
    }
}

public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.speed();
        v = new Bike();
        v.speed();
    }
}
