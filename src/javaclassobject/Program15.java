package javaclassobject;
/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
       Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Display the original values
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the numbers
        int temp = num1; // Store num1 in temp
        num1 = num2;     // Assign num2 to num1
        num2 = temp;     // Assign temp (which holds the original num1) to num2

        // Display the swapped values
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        // Close the scanner
        scanner.close();
    }
}
