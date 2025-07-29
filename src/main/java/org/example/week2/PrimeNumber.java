package org.example.week2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime using the isPrime method
        if (isPrime(number, 2)) {
            System.out.println(number + " It is a prime number.");
        } else {
            System.out.println(number + " It is not a prime number. ");
        }
    }

    private static boolean isPrime(int number, int divisor){
        // Base cases: if number is less than 2, it's not prime; if divisor exceeds square root of number, it's prime
        if(number < 2){
            return false;
        }

        // If the number is equal to the divisor, it is prime.
        if (divisor == number) {
            return true;
        }
        // If number is divisible by divisor, it's not prime
        if (number % divisor == 0) {
            return false;
        }
        // Recursive case: check the next divisor
        return isPrime(number, divisor + 1);
    }
}
