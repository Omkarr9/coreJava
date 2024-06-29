// we can also create a custom Exception and use it to throw that particular exception to the user

import java.util.*;

class MyException extends Exception { // this is a custom exception class which extends Exception class from java
    public String toString() { // this method usually contains the name of the exception which is -->
                               // Exception(e)
        return "I am toString Exception";
    }

    public String getMessage() { // getMessage is used to print the message/description of the exception
        // this method is returned inside the try block by default after creating the
        // object of this exception class
        return "I am getMessage Exception";
    }
}

class ageException extends Exception {
    public String toString() {
        return "Age exception occured";
    }

    public String getMessage() {
        return "Please enter a valid age";
    }
}

public class exceptionClass {
    public static void main(String args[]) {

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");

        i = sc.nextInt();

        if (i < 10) {
            try {
                throw new MyException(); // initiating the myException class
                // throw new ArithmeticException(); , we can also throw an already existing
                // Exception using the "throw" keyword
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // this returns whatever is executed inside the toString() method
                e.printStackTrace(); // prints where the exception has occured

            }
        }

        // int age;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // age = sc.nextInt();
        // if (age < 18) {
        // try {
        // throw new ageException();
        // } catch (ageException e) {
        // System.out.println(e);
        // System.out.println(e.getMessage());
        // }
        // }

    }
}
