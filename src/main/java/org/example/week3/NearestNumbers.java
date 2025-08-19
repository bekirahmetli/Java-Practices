package org.example.week3;

import java.util.ArrayList;
import java.util.Collections;

public class NearestNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();// Create an ArrayList to store Integer values

        // Add 10 integer values to the list
        numbers.add(15);
        numbers.add(29);
        numbers.add(31);
        numbers.add(47);
        numbers.add(56);
        numbers.add(62);
        numbers.add(73);
        numbers.add(89);
        numbers.add(92);
        numbers.add(100);

        // Sort the list in ascending order to compare adjacent elements
        Collections.sort(numbers);

        // Initialize minDifference with the maximum integer value to ensure any difference will be smaller
        int minDifference = Integer.MAX_VALUE;
        int number = 0;// Initialize variables to store the two closest numbers
        int number2 = 0;

        // Iterate through the sorted list to find the pair with the smallest difference
        for (int i=0 ; i<numbers.size()-1 ; i++){
            int difference = numbers.get(i+1) - numbers.get(i);// Calculate the difference between the current number and the next number

            if(difference < minDifference){// Update minDifference and the closest pair if a smaller difference is found
                minDifference = difference;
                number = numbers.get(i);
                number2 = numbers.get(i+1);
            }

        }

        System.out.println("The two closest elements are: " + number + " and " + number2);
        System.out.println("The difference between them is: " + minDifference);
    }
}
