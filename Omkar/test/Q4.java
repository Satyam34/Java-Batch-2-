/* Inheritance in Java is a feature that allows one class (the subclass) to inherit properties and methods from another class (the superclass).
*/
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Dog inherits from Animal
        myDog.eat();  
        myDog.bark(); 
    }
}
