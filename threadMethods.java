// some common thread methods
// 1) start()  2) join()  3) sleep()

// start() method is used to execute the run() method inside the thread

// join() method is used to completely run and finish one thread and after the completion of that thread, next thread will be able to run

// sleep() method is used to pause or sleep a thread for some time (miliseconds or seconds)

//  there are many more thread methods which can be used, check them from oracle java documentation

class Thread9 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 9 is running!");
            try {
                Thread.sleep(500); // sleep() method will pause the thread9 from being running for 500 miliseconds
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

class Thread10 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 10 is running!");
            i++;
        }
    }
}

public class threadMethods {
    public static void main(String args[]) {
        Thread9 th9 = new Thread9();
        Thread10 th10 = new Thread10();

        th9.start();
        try {
            th9.join(); // this method will make th10 to wait unitl th9 is completed
        } catch (Exception e) {
            System.out.println(e);
        }
        th10.start();
    }

}