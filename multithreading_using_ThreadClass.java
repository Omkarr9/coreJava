// this program demonstrates multithreading in java using "extending the Thread class"

class Thread1 extends Thread {

    @Override
    public void run() { // this run function is built in inside the Thread.java class and now we are
                        // overriding it

        while (true) { // creating an infinite loop for demonstration
            System.out.println("Thread 1 is running");
        }
    }

    public void testFunc1() {
        System.out.println("This is testFunc1");
    }
}

class Thread2 extends Thread {

    @Override
    public void run() { // this run function is built in inside the Thread.javanclass and now we are
                        // overriding it

        while (true) { // creating an infinite loop for demonstration
            System.out.println("Thread 2 is running");
        }
    }

    public void testFunc2() {
        System.out.println("This is testFunc2");
    }
}

public class multithreading_using_ThreadClass {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.run();
        t2.run();
        // t1.start(); // we can also use start() method to call the run method
        // t2.start();
        t1.testFunc1();
        t2.testFunc2();
    }
}
