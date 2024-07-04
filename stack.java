// synchronization.java program uses this code
import java.util.*;


public class stack {
    private int[] array;
    private int stackTop; // this is index for the array (stack)

    public stack(int capacity){ // constructor for class stack
        array = new int[capacity];
        stackTop = -1; // initially the index will be -1
    }

    public boolean push(int element){
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

    public int pop(){
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
}
