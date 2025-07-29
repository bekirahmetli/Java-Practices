package org.example.week1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a = scanner.nextInt();

        System.out.print("Enter b value: ");
        int b = scanner.nextInt();

        System.out.print("Enter c value: ");
        int c = scanner.nextInt();

        // Calculate the result using the formula: a + (b * c) - b
        int calculate = (a +(b*c)-b);
        // Print the calculated result
        System.out.println("Value is: " + calculate);
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
