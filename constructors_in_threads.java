// we can also use constrcutors inside the threads

class Thread5 extends Thread {
    public Thread5(String threadName) {
        super(threadName); // this constructor is already present inside the Thread class so we are
                           // invoking it using super
    }

    public void run() {
        System.out.println("Thread 5 is running!");
    }
}

public class constructors_in_threads {
    public static void main(String args[]) {
        Thread5 th5 = new Thread5("Omkar"); // passing value to the constructor as "omkar", this is usually considered
                                            // as the Thread name
        th5.start();
        System.out.println("Name of the thread is " + th5.getName());
        System.out.println("ID of the Thread is " + th5.threadId());

    }

}
