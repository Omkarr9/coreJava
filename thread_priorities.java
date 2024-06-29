/* The JVM defines a range of ten logical priorities for Java threads, including:

java.lang.Thread.MIN_PRIORITY  = 1
java.lang.Thread.NORM_PRIORITY = 5
java.lang.Thread.MAX_PRIORITY  = 10

These values [1..10] are passed into Thread.setPriority(int) to assign priorities to Java threads. 
The default priority of a Java thread is NORM_PRIORITY. 
(A Java thread that doesn't explicitly call setPriority runs at NORM_PRIORITY.) 
A JVM is free to implement priorities in any way it chooses, including ignoring the value. */

class Thread8 extends Thread {
    Thread8(String name) { // this is a constructor which takes String input and can be used to call
                           // getname, setName (Thread name)
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("Thread 8, Name: " + this.getName());
        }
    }
}

public class thread_priorities {
    public static void main(String args[]) {
        Thread8 th81 = new Thread8("Omkar");
        Thread8 th82 = new Thread8("Anurag");
        Thread8 th83 = new Thread8("Sudeep");
        Thread8 th84 = new Thread8("person 4");
        Thread8 th85 = new Thread8("Person5");

        th81.setPriority(Thread.MAX_PRIORITY); // setting priority as max
        th84.setPriority(Thread.MIN_PRIORITY); // setting priority as min
        th82.setPriority(3); // custom priority value ( ranges from 1-10)

        th81.start();
        th82.start();
        th83.start();
        th84.start();
        th85.start();

    }
}
