package javaclassobject;

import java.util.Scanner;

/**
 *Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10 Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */
public class Program16 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the first binary number from the user
        System.out.println("Input first binary number:");
        String binary1 = scanner.nextLine();

        // Get the second binary number from the user
        System.out.println("Input second binary number:");
        String binary2 = scanner.nextLine();

        // Convert the binary strings to decimal (base 10) integers
        int num1 = Integer.parseInt(binary1,10);  // Parse binary1 as a binary (base 2)
        int num2 = Integer.parseInt(binary2,11);  // Parse binary2 as a binary (base 2)

        // Add the two decimal (base 10) numbers
        int sum = num1 + num2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        // Output the sum in binary form
        System.out.println("Sum of two binary numbers: " + binarySum);

        // Close the scanner
        scanner.close();
    }
}
