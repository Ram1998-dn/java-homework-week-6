package javaclassobject;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 */
public class Program1 {
    // Instance Variables
    String var1 = "Nidhi";
    String var2 = "Desai";

    public static void main(String[] args) {
        // Create object inside the main method
        Program1 obj = new Program1();
        obj.myMethod();

    }
    // Create Instance method
    public void myMethod(){
        // call both variable into instance method inside print statement
        System.out.println("My Name is " +var1+ " " +var2+ ".");

    }
}
