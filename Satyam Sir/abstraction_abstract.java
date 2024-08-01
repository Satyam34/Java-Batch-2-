public class abstraction_abstract {
    public static void main(String[] args) {

        Dog nonu = new Dog();
        nonu.walk();

        //     mian-->Dog-->Animal
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Runing...");
    }

    void eat() {
        System.out.println("Animal call eat function....");
    }

    abstract void walk();

    abstract void ears();
}

class Horse extends Animal {

    // Horse --> Animal

    void walk() {
        System.out.println("Horse walk on 4 legs.");
    }

    void ears() {
        System.out.println("Horse have 2 ears.");
    }
}

class Dog extends Animal {

    // Dog --> Animal

    void walk() {
        System.out.println("Dog walk on 4 legs.");
    }

    void ears() {
        System.out.println("Dog have 2 ears.");
    }
}