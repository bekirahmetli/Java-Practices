package org.example.week1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer number: ");
        int numberint = scanner.nextInt();

        System.out.println("Enter a Double number: ");
        double numberDouble = scanner.nextDouble();

        // Convert a whole number to a double number
        double inttodouble = numberint;

        // Convert a double number to an integer
        int doubletoint = (int) numberDouble;

        // Print the results on the screen
        System.out.println("Integer (" + numberint + ") converted to double number: " + inttodouble);
        System.out.println("Double (" + numberDouble + ") converted to an integer: " + doubletoint);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
