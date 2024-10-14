package javaclassobject;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
        String instanceVar1 = "Java ";   // Instance variable (String)
        char instanceVar2 = 'J';        // Instance variable (char)

        static int staticVar1 = 42;        // Static variable (int)
        static boolean staticVar2 = true; // Static variable (Boolean)

    public static void main(String[] args) {
        Program4 obj = new Program4();    // Crate object for instance method
       obj.displayInstanceMethod();
       displayStaticMethod();

    }

    // 4.2 Declare one instance method
    public void displayInstanceMethod() {
        // Call all four instance and static variables in the instance method
        System.out.println("Instance Variable 1 (String): " + instanceVar1);
        System.out.println("Instance Variable 2 (char): " + instanceVar2);
        System.out.println("Static Variable 1 (int): " + staticVar1);
        System.out.println("Static Variable 2 (Boolean): " + staticVar2);
    }

    // 4.3 Declare one static method
    public static void displayStaticMethod() {
        // Call all four instance and static variables in the static method
        // We use the object `obj` to access instance variables
        Program4 obj = new Program4(); // Create an object to access instance variables
        System.out.println("Instance Variable 1 (String) from static method: " + obj.instanceVar1);
        System.out.println("Instance Variable 2 (char) from static method: " + obj.instanceVar2);
        System.out.println("Static Variable 1 (int): " + staticVar1);
        System.out.println("Static Variable 2 (Boolean): " + staticVar2);
    }

}
