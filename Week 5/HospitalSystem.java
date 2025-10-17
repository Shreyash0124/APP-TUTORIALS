class Patient {
    String name;
    int age;
}

class InPatient extends Patient {
    int roomNumber;

    void display() {
        System.out.println("In-Patient: " + name + ", Age: " + age + ", Room: " + roomNumber);
    }
}

class OutPatient extends Patient {
    void display() {
        System.out.println("Out-Patient: " + name + ", Age: " + age);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        InPatient ip = new InPatient();
        ip.name = "John"; ip.age = 30; ip.roomNumber = 201;
        ip.display();

        OutPatient op = new OutPatient();
        op.name = "Alice"; op.age = 25;
        op.display();
    }
}
