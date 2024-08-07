/* object:- Objects are entities in the real world,
Any entity that has state and behavior is known as an object.

 class:The collection of objects is called class.
*/
// Define a class called Car
class Car {
    // Data (attributes)
    String color;
    int year;
    
    // Method (action)
    void drive() {
        System.out.println("The car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // this is an object
        myCar.color = "Red";   
        myCar.year = 2024;     
        myCar.drive();         
    }
}
