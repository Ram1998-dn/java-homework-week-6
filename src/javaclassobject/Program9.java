package javaclassobject;
/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get a string input in uppercase from user
        System.out.println("Enter String in Uppercase:");
        String uppercase = scanner.nextLine();

        // Convert the string to lowercase using toLowerCase() method
        String lowercase = uppercase.toLowerCase();

        // Output the converted lowercase string
        System.out.println("The String convert into lowercase: " +lowercase);

        // Close the scanner
        scanner.close();


    }
}
