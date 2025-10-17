class Admission {
    void admissionProcess() {
        System.out.println("General admission process");
    }
}

class UndergraduateAdmission extends Admission {
    void admissionProcess() {
        System.out.println("Merit + Entrance Test");
    }
}

class PostgraduateAdmission extends Admission {
    void admissionProcess() {
        System.out.println("Written Test + Interview");
    }
}

public class UniversityAdmission {
    public static void main(String[] args) {
        Admission a1 = new UndergraduateAdmission();
        a1.admissionProcess();

        Admission a2 = new PostgraduateAdmission();
        a2.admissionProcess();
    }
}

