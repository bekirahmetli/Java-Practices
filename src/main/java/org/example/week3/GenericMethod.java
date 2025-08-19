package org.example.week3;

public class GenericMethod {
    // Generic method to print elements of an array of any type
    public static <T> void printArray(T[] array){
        // Iterate over each element in the array and print it followed by a space
        for (T element : array){
            System.out.print(element + " ");
        }
        System.out.println();// Move to the next line after printing all elements
    }

    public static void main(String [] args){
        Integer[] intArray = {1,2,3,4,5};// Create an Integer array with values 1 through 5
        String[] stringArray = {"Java", "Generics", "Ödev"};// Create a String array with the values "Java", "Generics", and "Ödev"

        printArray(intArray);// Call the generic printArray method with the Integer array
        printArray(stringArray);// Call the generic printArray method with the String array
    }
}
