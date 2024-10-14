package javaclassobject;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Write a program to insert any temperature value
 * in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Get the temperature in Fahrenheit from the user
        System.out.println("The Enter Temperature value in fahrenheit:");
        double F = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula (F − 32) × 5/9
        double C = (F - 32) * 5 / 9;

        // Output the temperature in Celsius
        System.out.println(F+ "`F is equal to " + C + " `c");

        // Close the scanner
        scanner.close();


    }
}
