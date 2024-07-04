// this class will will synchronization method using which we can allocate resources to only one thread at a single time

public class synchronization2 {
    public static void main(String[] args) {
        System.out.println("------Main is starting-----");

    stack2 stackArray = new stack2(5); // using stack class that we have created and setting the size of the array as 5

    // creating Thread using the new method called lamda expression
    // this is the new method for creating and using the Thread class
    new Thread(()->{
        int counter = 0;
        while(++counter < 10){ //running the loop for 10 times
            System.out.println("Pushed "+stackArray.push(7)); // pushing the element 7 in to the array
        } 
    }, "Pusher").start(); // pusher is the thread name

    new Thread(()->{
        int counter = 0;
        while(++counter < 10){
            System.out.println("Popped "+stackArray.pop()); // popping the element 7 from the array
        }
    }, "Popper").start();; // popper is the another thread name

    System.out.println("------Main is exiting------");
    // this will now not cause any exception because the thread which first has access to lock will get executed first
}
}

