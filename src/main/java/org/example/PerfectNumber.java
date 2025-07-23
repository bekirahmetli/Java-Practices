package org.example;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int num = scanner.nextInt();

        int sum = 0;

        /*
         * Check for perfect number:
         * A perfect number equals the sum of its proper divisors (excluding itself)
         * Loop through all numbers from 1 to num-1 to find divisors
         */
        for(int i=1;i<num;i++){
            // If i is a divisor of num (num % i == 0), add it to sum
            if(num % i == 0){
                sum +=i;
            }
        }

        // Determine if the number is perfect
        if(sum == num){
            System.out.println(num + " it is perfect number");
        }else {
            System.out.println(num + " it is not a perfect number");
        }
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
