class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1; e1.name = "Akshar"; e1.salary = 50000;

        Employee e2 = new Employee();
        e2.id = 2; e2.name = "Madan"; e2.salary = 60000;

        e1.display();
        e2.display();
    }
}

