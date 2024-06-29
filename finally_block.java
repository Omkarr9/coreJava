// The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection. 
// The finally block executes whether exception rise or not and whether exception handled or not. 
// A finally contains all the crucial statements regardless of the exception occurs or not.

class finallyClass {
    public int divideFunc(int a, int b) {
        try {
            int res = a / b;
            return res;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally: i am executed always");
        }
        return -1;
    }
}

public class finally_block {
    public static void main(String args[]) {
        finallyClass obj1 = new finallyClass();

        System.out.println(obj1.divideFunc(5, 0));
        // finally block is executed even after the exception has occured

        // how can we use finally block with loops?
        int a = 50;
        int b = 10;

        while (true) { // this loop will run until the c is greater than 0 (c > 0)

            try {
                System.out.println(a / b);
                System.out.println("The value of b currently is : " + b);
            } catch (Exception e) {
                System.out.println(e);
                break; // break out of the loop when c becomes 0 and exception is catched
            }

            finally {
                System.out.println("Finally : I am executed always");
                // this statement will run for one last time when the exception is catched
                // inside the catch block and loop is breaked
            }
            b--;
        }

    }

}
