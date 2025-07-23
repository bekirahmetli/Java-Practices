package org.example;

import java.util.Scanner;

public class ZodiacCalculate {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth year
        System.out.print("Enter your birth year : ");
        int year = scanner.nextInt();

        // Calculate the Chinese zodiac
        int zodiacCalculate = year % 12;

        // Determine the zodiac sign based on the calculated remainder
        switch (zodiacCalculate){
            case 0 :
                System.out.print("Your Chinese zodiac is Monkey");
                break;
            case 1 :
                System.out.print("Your Chinese zodiac is Cockerel");
                break;
            case 2:
                System.out.print("Your Chinese zodiac is Dog");
                break;
            case 3:
                System.out.print("Your Chinese zodiac is Pig");
                break;
            case 4:
                System.out.print("Your Chinese zodiac is Mouse");
                break;
            case 5:
                System.out.print("Your Chinese zodiac is Ox");
                break;
            case 6:
                System.out.print("Your Chinese zodiac is Tiger");
                break;
            case 7:
                System.out.print("Your Chinese zodiac is Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese zodiac is Dragon");
                break;
            case 9:
                System.out.print("Your Chinese zodiac is Snake");
                break;
            case 10:
                System.out.print("Your Chinese zodiac is Horse");
                break;
            case 11:
                System.out.print("Your Chinese zodiac is Sheep");
                break;
        }
        // Close the Scanner object to prevent resource leak
        scanner.close();

    }
}
