// You are tasked with writing a Java program that demonstrates the use of custom exceptions 
// and the throw and throws keywords. The program should simulate the process of retrieving elements from an array using user-specified indices, 
// while handling invalid indices and limiting the number of retrieval attempts.


import java.util.*;

class indexException extends Exception {

    public String toString() {
        return "Enter a valid index";
    }

    public String getMessage() {
        return "Index should be less than 5 and more than 0";
    }
}

class maxRetrivalChances extends Exception{
    public String toString(){
        return "You have reached the maximum chances for array retrival";
    }
    public String getMessage(){
        return "max chances exceeded";  
    }
}

public class practise_exception {
    public static void main(String args[]) {
        int[] arr = new int[5];
        arr[0] = 99;
        arr[1] = 98;
        arr[2] = 97;
        arr[3] = 95;
        arr[4] = 94;

        Scanner sc = new Scanner(System.in);
        int index;
        int count = 0;
        boolean flag = true;
        while (flag) {
            try{
                System.out.println("Enter the array index");
                 index = sc.nextInt();
                 if(index > 4 || index <0){
                    throw new indexException(); // custom exception are to be thrown inside try and catch block
                 }
                 System.out.println("The value at the array index is "+ arr[index]);
                 break;
            }
            catch(indexException e){
                count++;
                if(count > 4){
                    try{
                        throw new maxRetrivalChances(); // custom exceptions are to be thrown inside the try catch block
                    }
                    catch(maxRetrivalChances m){
                        System.out.println(m);
                        System.out.println(m.getMessage());
                        break;
                    }
                }
                System.out.println(e);
                System.out.println(e.getMessage());
            }
            
        }
    }
}
