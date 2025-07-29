package org.example.week2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1-10: ");// Prompt user to enter the upper limit
        int number = scanner.nextInt();

        if(number >= 1 && number <=10){// Check if number is not within the valid range (1-10)
            // Use nested for loops to generate the multiplication table
            for (int i=1;i<=number;i++){
                for(int j=1;j<=number;j++){
                    System.out.println(i+"x"+j+"="+i*j);
                }
                System.out.println();// Move to the next line after each row
            }
        }else{
            System.out.println("Error: Upper limit must be between 1 and 10 inclusive.");
        }
    }
}
