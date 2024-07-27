public class inheritance {
    public static void main(String[] args) {
        Child ramu = new Child();
        ramu.tall();
    }
}

class Father {
    String name;
    int age;

    void tall() {
        System.out.println("Tall man");
    }

    void eyes() {
        System.out.println("Eyes Blue");
    }
}

class Child extends Father {
    int fingers;

    void voice() {
        System.out.println("Sweet voice");
    }
}
