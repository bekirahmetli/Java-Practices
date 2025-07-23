package org.example;

import java.util.Scanner;

public class Greengrocer {
    public static void main(String [] args){
        // Define the price per kilogram for each product
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many kilos of pears did you buy: ");
        int pearKg = scanner.nextInt();

        System.out.print("How many kilos of apples did you buy: ");
        int appleKg = scanner.nextInt();

        System.out.print("How many kilos of tomatoes did you buy: ");
        int tomatoKg = scanner.nextInt();

        System.out.print("How many kilos of bananas did you buy: ");
        int bananaKg = scanner.nextInt();

        System.out.print("How many kilos of eggplant did you buy: ");
        int eggplantKg = scanner.nextInt();

        // Calculate the total cost by multiplying each product's weight by its price and summing them up
        double calculate = (pearPrice * pearKg) + (applePrice * appleKg) + (tomatoPrice * tomatoKg) + (bananaPrice * bananaKg) + (eggplantPrice * eggplantKg);
        // Display the total cost to the user
        System.out.print("Total: " + calculate);
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
