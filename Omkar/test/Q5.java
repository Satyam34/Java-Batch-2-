/*
Encapsulation is defined as the wrapping up of data & methods under a single unit. It also implements data hiding. 
real life example  A bankAccount  keeps its balance and ATM PIN information hidden and provides methods to withdraw balance.


*/


class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Q5{
    public static void main(String[] args) {
        Person person = new Person(); 
        person.setName("omkar");      
        System.out.println(person.getName()); 
    }
}
