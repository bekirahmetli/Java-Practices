package org.example.week1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter your number : ");
        int num = scanner.nextInt();

        /*
         * Print a descending star pattern:
         * - Outer loop controls the rows (starts from input number down to 1)
         * - Inner loop prints stars for each row (number of stars = current row number)
         */
        for(int i = num; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
