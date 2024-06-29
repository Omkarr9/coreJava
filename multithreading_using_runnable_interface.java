// this program demonstrates multithreading in java using "runnable interface"

class Thread3 implements Runnable {
    public void run() { // this class must have a run method because this is a interface and run method
                        // is an abstact method in runnable
        System.out.println("Thread 3 is running");
    }

    public void testMeth3() { // normal method
        System.out.println("This test method 3");
    }
}

class Thread4 implements Runnable {
    public void run() {
        System.out.println("Thread 3 is running");
    }

    public void testMeth4() {
        System.out.println("This is test method 4");
    }
}

public class multithreading_using_runnable_interface {
    public static void main(String args[]) {
        // first we need to create objects of the thread class
        Thread3 t3 = new Thread3(); // object for Thread3 class
        Thread4 t4 = new Thread4(); // object for Thread4 class

        // now we put these objects inside the Thread class
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t4);

        tt3.run();
        tt4.run();

        t3.testMeth3();
        t4.testMeth4();

    }
}
