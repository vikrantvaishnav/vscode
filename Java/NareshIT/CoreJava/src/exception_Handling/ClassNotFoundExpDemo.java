package exception_Handling;

import java.util.Scanner;

public class ClassNotFoundExpDemo {

    // Constructor that takes class name
    public ClassNotFoundExpDemo(String className) {

        Class<?> cls;

        try {
            // Attempt to load class dynamically
            cls = Class.forName(className);
            System.out.println("Class loaded successfully: " + cls.getName());

        } catch (ClassNotFoundException e) {
            // User-friendly error message
            System.out.println("Error: Class '" + className + "' not found.");

            // Print stack trace for debugging
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the class name to load: ");
        String className = sc.nextLine();

        // Calling constructor
        new ClassNotFoundExpDemo(className);

        sc.close();
    }
}

