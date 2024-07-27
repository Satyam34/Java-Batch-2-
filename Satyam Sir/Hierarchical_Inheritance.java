public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Child_2 pinku=new Child_2();
        pinku.hair();
        pinku.tow();
    }
}

class Father {
    String sirName;

    void eyes() {
        System.out.println("Eyes Blue...");
    }

    void hair() {
        System.out.println("Black Hair...");
    }
}

class Child_1 extends Father {
    void one() {
        System.out.println("I'm 1st child");
    }
}

class Child_2 extends Father {
    void tow() {
        System.out.println("I'm 2nd child");
    }

}

class Child_3 extends Father {
    void three() {
        System.out.println("I'm 3rd child");
    }
}
