public class CopyConstructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Kaku";
        s1.clas="10th";
        s1.rollNO=119;
        s1.teacherName="Ramu";

        Student s2=new Student(s1);
        s2.name="Kalu";
        s2.rollNO=120;  

        System.out.println(s1.name+" "+s1.clas+", "+s2.name+" "+s2.clas);
    }
}

class Student {
    String clas;
    String teacherName;
    int rollNO;
    String name;

    Student(Student copy){
        this.clas=copy.clas;
        this.teacherName=copy.teacherName;
    }

    Student(){
        System.out.println("It's Working!");
    }
}