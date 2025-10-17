class StudentMarks {
    private String studentName;
    private int marks;

    public StudentMarks(String name, int marks) {
        this.studentName = name;
        this.marks = marks;
    }

    // Only teachers can update marks
    public void setMarks(int marks, String role) {
        if (role.equalsIgnoreCase("Teacher")) {
            this.marks = marks;
            System.out.println("Marks updated successfully!");
        } else {
            System.out.println("Access Denied! Only teachers can update marks.");
        }
    }

    // Students can only view marks
    public int getMarks() {
        return marks;
    }
}

public class StudentMarksSystem {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks("Akshar", 85);
        System.out.println("Student Marks: " + s.getMarks());

        s.setMarks(90, "Student");
        s.setMarks(90, "Teacher");

        System.out.println("Updated Marks: " + s.getMarks());
    }
}
