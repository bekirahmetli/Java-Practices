package org.example.week2;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter password
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        // Check all rules using ternary operator: length >= 8, no spaces, first letter uppercase, last character is '?'
        String result = (password.length() >= 8 &&
                !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
                password.charAt(password.length() - 1) == '?')
                ? "Volid Password"
                : "Not a volid password. Please check the conditions.";

        // Print the validation result
        System.out.println(result);
        // Close the scanner
        scanner.close();

    }
}
