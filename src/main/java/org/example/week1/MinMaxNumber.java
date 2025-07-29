package org.example.week1;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Ask user how many numbers they want to compare
        System.out.print("HOW MANY NUMBER WILL YOU ENTER? ");
        int num = scanner.nextInt();


        // must be positive number
        if(num<0){
            System.out.println("Please enter a positive number!");
        }else{
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=1;i<=num;i++){
                System.out.println(i+".value enter: ");
                int enterValue = scanner.nextInt();

                // Update max if current number is larger than current max
                if(enterValue>max){
                    max = enterValue;
                }

                // Update min if current number is smaller than current min
                if(enterValue<min){
                    min = enterValue;
                }
            }

            // Display results
            System.out.println("Biggest num is : "+ max);
            System.out.println("Smallest num is " + min);
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
