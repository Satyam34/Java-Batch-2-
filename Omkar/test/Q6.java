/* 
Polymorphism:Using the same action in different ways for different objects.
Different vehicles Car, Truck may have different horn sounds, but they all use the honk() method

*/
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    
    void sound() {
        System.out.println("dog barks");
    }
}
class Cat extends Animal {
    
    void sound() {
        System.out.println("cat meows");
    }
}
public class Q6 {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        Animal myCat = new Cat(); 
        myDog.sound();  
        myCat.sound(); 
    }
}
