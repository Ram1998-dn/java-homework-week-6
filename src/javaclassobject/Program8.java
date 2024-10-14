package javaclassobject;

import java.util.Scanner;

/**
 *Write a program to calculate the area of a triangle.
 *
 *Area= 0.5 * base * height
 *
 */
public class Program8 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Get the base of the triangle from the user
        System.out.println("Enter the base of triangle:");
        double base = scanner.nextDouble();

        //Get the height of the triangle from the use
        System.out.println("Enter the height of triangle:");
        double height = scanner.nextDouble();

        // Calculate the area using the formula: (1/2) * base * height
        double area = 0.5 * base * height;

        // Output the area of the triangle
        System.out.println("The Area of triangle is :" +area);

        // Close the scanner
        scanner.close();

    }
}
