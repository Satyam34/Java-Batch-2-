/*
Constructor  is a special method which is invoked automatically at the time of object creation
 Constructor have the same name as class or structure.
 Constructor doesn't have a return type Not even void.
 Type of Constructors:-Parameterized,Non-parameterized,Copy Constructors
 */
class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Person person = new Person("omkar"); 
        System.out.println(person.name);     
    }
}
