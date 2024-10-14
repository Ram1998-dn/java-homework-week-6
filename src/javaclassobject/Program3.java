package javaclassobject;

/**
 * 3.1 Declare one instance and one static variable
 * 3.2 Declare one instance method
 * 3.3 Declare one static method
 * 3.4 Call both instance and static variables in the static method
 * 3.5 Declare the Main method
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    // Declare instance and static variables
    int instanceVar = 10;
    static int  staticVar = 20;

    public static void main(String[] args) {
        // Create an instance of MyClass
        Program3 obj = new Program3();
        // Call the instance method using the obj
        obj.instanceMethod();
        //Call static method directly
        staticMethod();

    }
    // Instance Method
    public void instanceMethod(){
        System.out.println("Instance Variable : " +instanceVar);
        System.out.println("Static Variable : " +staticVar);
    }
    // Static Method
    public static void staticMethod(){
        // Create an object to access the instance variable
        Program3 obj = new Program3();
        System.out.println("Instance Variable(From static method): " +obj.instanceVar);
        System.out.println("Static Variable (From static method): " +staticVar);


    }
}
