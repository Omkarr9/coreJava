import java.util.LinkedList;
import java.util.*;


public class blockingQueue {
    private Queue<Integer> q; // initialising a queue
    private int capacity;


    public blockingQueue(int cap){
        q = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int item){
        synchronized(q){ // we are passing the queue object q itself as the lock
            // make sure to use while loop instead of using if() condition because using if condition may cause a index out of bound exception as it does not check if the condition holds correct or not after the wait() is completed and directly performs add() operation
            while(q.size() == capacity){  // if index position reaches the max available position
                try{
                    q.wait(); // tell the q to wait until there is space for adding a item into the q
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            q.add(item);
            q.notifyAll(); // notifying other threads that the operation is completed and they can fight for the lock
            return true;
        }
    }

    public boolean remove(int item){
        synchronized(q){ // passing the q object of queue itself as the lock
            while(q.size() < 0){ // we have to use while condition instead of if condition to avoid index out of bound exception because the condition inside the while loop is tested before performing the below operations while in the if condition when the thread is finished waiting the below poll operation is executed without checking if the queue is empty or not
                try{
                    q.wait();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            q.poll();
            q.notifyAll();
            return true;
        }
    }
}
