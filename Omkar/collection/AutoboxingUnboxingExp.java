package Omkar.collection;

import java.util.ArrayList;

public class AutoboxingUnboxingExp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing:adding primitive int values to the ArrayList
        numbers.add(10);// Autoboxing int to integer
        numbers.add(20);
        numbers.add(30);

        System.out.println("Arraylist of intger:-" + numbers);

        // Unboxing: retrieving values from the ArrayList and using them as primitive
        // int
        int firstNumber = numbers.get(0); // Unboxing integer to int
        int secondNumber = numbers.get(1);

        System.out.println("first number:-" + firstNumber);
        System.out.println("first number:-" + secondNumber);

        int sum = firstNumber + secondNumber;
        System.out.println(" sum of first and second number:-" + sum);

    }
}
