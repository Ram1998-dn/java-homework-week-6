package javaclassobject;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement
 * 2.4 Declare the Main method
 * 2.5 Call the static method into the Main method and Run the program
 */
public class Program2 {
    // Declare Two static variables
    static String var1 = "Hello";
    static String var2 = "Nidhi";

    public static void main(String[] args) {
        //call static method
        staticVariables();
    }
    public static void staticVariables(){
        //call both static variable into static method inside print statement
        System.out.println(var1+ " " +var2); // concatenation

    }
}
