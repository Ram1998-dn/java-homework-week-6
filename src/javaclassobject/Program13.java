package javaclassobject;
/**
 * Write a Java program that takes three numbers
 * as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the three numbers from the user
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Calculate the average
        double average = (num1 + num2 + num3) / 3;

        // Print the average
        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}
