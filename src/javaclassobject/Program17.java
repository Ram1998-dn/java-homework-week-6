package javaclassobject;
/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5
 * Expected Output Binary number is: 101
 */

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the decimal number from the user
        System.out.println("Input a Decimal Number:");
        int decimal = scanner.nextInt();

        // Convert the decimal number to a binary string
        String binary = Integer.toBinaryString(decimal);

        // Print the binary number
        System.out.println("Binary number is: " + binary);

        // Close the scanner
        scanner.close();
    }
}
