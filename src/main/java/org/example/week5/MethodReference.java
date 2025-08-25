package org.example.week5;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        // Create a List to store String values
        List<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        /*

        //Traditional method to print list elements
        for (String name : names) {
            System.out.println(name);
        }

         */

        // Print each name using method reference to System.out.println
        names.forEach(System.out::println);
    }
}
