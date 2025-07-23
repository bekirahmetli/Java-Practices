package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        /*
         * 1. If a year is divisible by 4 but not by 100, it's a leap year
         * 2. If a year is divisible by 400, it's a leap year
         * 3. All other cases are not leap years
         */
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is an leap year !");
        } else {
            System.out.println(year + " is not a leap year !");
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
