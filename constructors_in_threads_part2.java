// using constructors in Threads in runnable thread method

class Thread6 implements Runnable {
    // since this a interface and not inheritance we cannot use super
    public void run() {
        System.out.println(" Thread 6 is running");
    }
}

class Thread7 extends Thread {
    public Thread7(Runnable r, String threadName) {
        super(r, threadName);
    }

    public void run() {
        System.out.println(" Thread 7 is running");
    }
}

public class constructors_in_threads_part2 {
    public static void main(String args[]) {

        Thread6 th6 = new Thread6();
        Thread th66 = new Thread(th6);

        th66.start();
        System.out.println("The ID of Thread 6 is " + th66.threadId());
        System.out.println("Name of the Thread 6 is " + th66.getName()); // default name will be given if no name is set

        Thread7 th7 = new Thread7(th66, "omkar"); // passing object of Thread 6 class as Runnable parameter to the
                                                  // Thread 7 constructor
        th7.start();
        System.out.println("The name of Thread 7 is " + th7.getName());
        System.out.println("The ID of the Thread 7 is " + th7.threadId());

    }
}
