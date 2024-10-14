package javaclassobject;
/**
 * Write a program to enter any radius value of the circle and find out the area.
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the radius value from the user
        System.out.println("Enter the radius of the circle:");
        double r = scanner.nextDouble();

        // Define the value of PI
        final double PI = 3.14159;

        // Calculate the area using the formula A = PI * r * r
        double area = PI * r * r;

        // Output the area
        System.out.println("The area of circle with radius " +r+ " is: " +area);

        //scanner close
        scanner.close();



    }
}
