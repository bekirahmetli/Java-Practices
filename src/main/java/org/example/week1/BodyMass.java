package org.example.week1;

import java.util.Scanner;

public class BodyMass {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter your weight: ");
        double weight = scanner.nextDouble();

        // Calculate BMI using the formula: weight / (height * height)
        double calculate = weight / (height * height);
        // Display the calculated BMI to the user
        System.out.println("Your Body Mass Index is: " + calculate);
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
