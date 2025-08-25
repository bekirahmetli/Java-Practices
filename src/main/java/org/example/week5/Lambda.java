package org.example.week5;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        // Create a List to store Integer values
        List<Integer> numbers = new ArrayList<>();

        // Add initial numbers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        /*

        //Traditional method to double each number in the list
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }

        // Print the results
        for (int number : numbers) {
            System.out.println(number);
        }

        */

        // Use lambda expression with forEach to print each number doubled directly
        numbers.forEach(number -> System.out.println(number * 2));
    }
}
