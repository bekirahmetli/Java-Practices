package org.example.week3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FindingFrequencyLettersWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// Create a Scanner object to read user input

        System.out.println("Please enter a word:");// Prompt user to enter a word and read the input
        String word = scanner.nextLine();

        Map<Character,Integer> letterFrequency = new TreeMap<>();// Create a TreeMap to store letter frequencies, ensuring sorted order of keys

        for (int i=0 ; i < word.length() ; i++){// Iterate through each character in the word
            char letter = word.charAt(i);// Get the character at the current index

            if(Character.isLetter(letter)){// Check if the character is a letter
                letterFrequency.put(letter,letterFrequency.getOrDefault(letter,0) +1);// Update the frequency in the map: increment existing count or start with 1
            }
        }

        // Iterate over the map entries and print each letter and its frequency
        for (Map.Entry<Character,Integer> entry : letterFrequency.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
