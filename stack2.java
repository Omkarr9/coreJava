// synchronization2.java program uses this code
import java.util.*;


public class stack2 {
    private int[] array;
    private int stackTop; // this is index for the array (stack)
    Object lock; // any object in java can used as a lock (primitive data types are not allowed but we can use wrapper classes such as Integer, Double etc)

    public stack2(int capacity){ // constructor for class stack
        array = new int[capacity];
        stackTop = -1; // initially the index will be -1
        lock = new Object(); // creating new lock object
    }

    public boolean push(int element){
        // synchronizing the this section of code with lock object
        synchronized(lock){ // thread which have access to this lock can only use the resources
            if(isFull()){
                return false;
            }
            ++stackTop;
            try{
                Thread.sleep(1000); // putting the thread to sleep for 1 second (1000 mili seconds)
            }
            catch(Exception e){
                System.out.println(e);
            }
            array[stackTop] = element;
            return true;
        }
        
    }

    public int pop(){
        synchronized(lock){ // thread which have acces to this lock can only use the resources
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            try{
                Thread.sleep(1000); // putting the thread to sleep for 1 second (1000 mili seconds)
            }
            catch(Exception e){
                System.out.println(e);
            }
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            stackTop--;
            return obj;
        }
    }

    public boolean isFull(){
        if(stackTop == array.length-1){ // if stackTop has reached the maximum length of the array then array is full
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(stackTop < 0){  // if stackTop is still negative (-1) then array is empty as no element is added to the array
            return true;
        }
        return false;
    }

    // we can also make the full method as synchronized and for that we dont need to pass any lock since the object of that particular class will be used as their lock
    /* 
    public synchronized boolean push(int element){
            if(isFull()){
                return false;
            }
            ++stackTop;
            try{
                Thread.sleep(1000); // putting the thread to sleep for 1 second (1000 mili seconds)
            }
            catch(Exception e){
                System.out.println(e);
            }
            array[stackTop] = element;
            return true;
    }

    public synchronized int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            try{
                Thread.sleep(1000); // putting the thread to sleep for 1 second (1000 mili seconds)
            }
            catch(Exception e){
                System.out.println(e);
            }
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            stackTop--;
            return obj;
    }
    */
}
