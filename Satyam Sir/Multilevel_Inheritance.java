public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Child kalu=new Child();
        kalu.eyes();
    }
}

class GrandFather {
    String sir_name;
    int age;

    void tall() {
        System.out.println("Tall man");
    }

    void eyes() {
        System.out.println("Eyes Blue");
    }
}

class Father extends GrandFather {
    int fingers;

    void voice() {
        System.out.println("Sweet voice");
    }
}

class Child extends Father {
    int fingers;

    void brain() {
        System.out.println("not good");
    }
}
