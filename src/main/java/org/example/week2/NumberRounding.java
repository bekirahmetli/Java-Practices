package org.example.week2;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: "); // Prompt user to enter a decimal number
        double number = scanner.nextDouble();

        // Round down to the nearest integer using Math.floor()
        int floorValue = (int) Math.floor(number);
        System.out.println(floorValue);

        // Round up to the nearest integer using Math.ceil()
        int ceilValue = (int) Math.ceil(number);
        System.out.println(ceilValue);

        // Round to the nearest integer using Math.round()
        int roundValue = (int) Math.round(number);
        System.out.println(roundValue);

        scanner.close(); // Close the scanner
    }
}
