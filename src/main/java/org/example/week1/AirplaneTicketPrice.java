package org.example.week1;

import java.util.Scanner;

public class AirplaneTicketPrice {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in km : ");
        int distance = scanner.nextInt();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        int type = scanner.nextInt();

        // Validate input: distance, age, and trip type must be positive and valid
        if (distance <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("You entered incorrect data !");
        } else{
            // Calculate the base ticket price (0.10 TL per km)
            double normalAmount = distance * 0.10;
            double ageDiscount = 0.0;
            double discountedAmount = normalAmount;

            // Apply age-based discounts:
            // - 50% discount for children under 12
            // - 10% discount for ages 12-24
            // - 30% discount for seniors (65+)
            if(age < 12){
                discountedAmount = normalAmount * 0.50;
            } else if (age >= 12 && age <= 24) {
                ageDiscount = normalAmount * 0.10;
            } else if (age >= 65) {
                ageDiscount = normalAmount * 0.30;
            }
            discountedAmount = normalAmount - ageDiscount;

            // Apply round-trip discount (20% off the already discounted price)
            double roundTripDiscount = 0.0;
            if (type == 2) {
                roundTripDiscount = discountedAmount * 0.20;
                discountedAmount = (discountedAmount - roundTripDiscount) * 2;
            }
            // Display the final calculated ticket price
            System.out.println("Total Amount = " + discountedAmount + " TL");
        }
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
