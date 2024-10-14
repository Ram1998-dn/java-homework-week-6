package javaclassobject;
/**
 * Write a program for a calculator with addition, subtraction, multiplication and
 * division methods all with parameters and use string concatenation methods.
 */

import java.util.Scanner;

public class Program5 {


    // Instance methods for addition and subtraction with parameters
    public void addition(int num1, int num2){
        // Addition operation with string concatenation for result display
        System.out.println(num1+ "+ " +num2+ " = " +(num1+num2));
    }
    public void subtraction(int num1, int num2){
        // Subtraction operation with string concatenation for result display
        System.out.println(num1+ " - " +num2+ " = " +(num1-num2));
    }
    // Static method for multiplication and division with parameters
    public static void multiplication(int num1, int num2){

        // Multiplication operation with string concatenation for result display
        System.out.println(num1+ " * " + num2+ " = " +(num1 * num2));
    }
    public static void division(int num1, int num2){
        // Division operation with string concatenation for result display
        System.out.println(num1+ " / " + num2 + " = " +((float) num1 / num2));
    }
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create an object of the Program5 class
        Program5 obj = new Program5();

        // Get user input for two numbers
        System.out.println("Enter First Number:");
        int num1 = scanner.nextInt();  // Input for first number

        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();  // Input for second number

        // Call instance methods using the object
        System.out.println("\nCalling instance method:");
        obj.addition(num1,num2); // call addition
        obj.subtraction(num1,num2); // call subtraction

        // Call static method directly
        System.out.println("\nCalling static method");
        multiplication(num1,num2); // call multiplication
        division(num1,num2); // call division method

        // Close the scanner
        scanner.close();

    }
}
