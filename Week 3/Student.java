class Student {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 101; s1.name = "Akshar"; s1.marks = 89.5;

        Student s2 = new Student();
        s2.rollNo = 102; s2.name = "Madan"; s2.marks = 92.0;

        s1.display();
        s2.display();
    }
}
