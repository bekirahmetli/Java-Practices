package org.example.week3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FindLetters {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);// Create a Scanner object to read user input
        ArrayList<String> letters = new ArrayList<>();// Create an ArrayList to store String values representing letters

        // Add initial letters to the list
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");

        // Print the initial state of the list
        System.out.println("Initial List: "+letters);

        int counter = 0;// Initialize a counter to control the loop (maximum 4 iterations)

        while (counter<4){
            System.out.println("Please enter letter: ");// Prompt user to enter a letter
            String enteredLetter = scanner.next().toLowerCase();// Read the input and convert to lowercase for case-insensitive comparison

            boolean isLetter = false;// Flag to check if the entered letter exists in the list
            int letterIndex = -1;// Variable to store the index of the found letter

            for (int i=0;i<letters.size();i++) {// Iterate through the list to check if the entered letter exists
                if (letters.get(i).equals(enteredLetter)) {
                    isLetter = true;
                    letterIndex = i;
                    break;// Exit loop once the letter is found
                }
            }

            counter++;// Increment the counter after each iteration

            // If the letter is found, mark it as "found" at its index
            if (isLetter){
                letters.set(letterIndex,"found");
            } else {
                letters.add(enteredLetter);// If the letter is not found, add it to the list
            }
        }

        System.out.println("Current List: "+letters);// Print the final state of the list after all iterations
    }
}
