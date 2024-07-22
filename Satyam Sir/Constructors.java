public class Constructors {
    public static void main(String[] args) {
        // school student_1 = new school();
        school student_2 = new school("Satyam");
        // System.out.println("Student 1: "+student_1.userName);
        System.out.println("Student 2: "+student_2.userName);

    }
}

class school {
    String userName;
    String className;

    // school() {}

    school(String userName) {
        this.userName=userName;
    }
}