package org.example.week2.SallaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter employee name: "); // Prompt user to enter employee name
        String name = scanner.nextLine();

        System.out.print("Enter salary: "); // Prompt user to enter salary
        double salary = scanner.nextDouble();

        System.out.print("Enter weekly work hours: "); // Prompt user to enter weekly work hours
        int workHours = scanner.nextInt();

        System.out.print("Enter hire year: "); // Prompt user to enter hire year
        int hireYear = scanner.nextInt();

        // Create Employee object with user input
        Employee employee = new Employee(name, salary, workHours, hireYear);

        // Print employee details
        System.out.println(employee);

        scanner.close(); // Close the scanner
    }
}
