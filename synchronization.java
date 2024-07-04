// Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and finally produce erroneous and unforeseen results. 

// Why use Java Synchronization?
// Java Synchronization is used to make sure by some synchronization method that only one thread can access the resource at a given point in time. 

// Java Synchronized Blocks
// Java provides a way of creating threads and synchronizing their tasks using synchronized blocks. 

public class synchronization {
    public static void main(String[] args) {
        System.out.println("------Main is starting-----");

    stack stackArray = new stack(5); // using stack class that we have created and setting the size of the array as 5

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

    // this code will eventually throw an index out of bound exception, because what is thread performing push operation gets executed when the index has become < -1 after performing the pop operation multiple times 
    // to overcome this situation, we use synchronization block which makes sure that only one thread has access to particular resources at a time
    // we will the push and pop operation inside a synchronization block 
}
}

