// throw keyword is used to throw an exception explicitly by the user

// throws keyword is used to define a function which might throw any particular exception

// throws keyword helps user know that this method/function might throw an exception

import java.util.*;


class NegativeRadiusException extends Exception{
    public String toString(){
        return "Negative Radius Exception occured";
    }

    public String getMessage(){
        return "NegativeRadiusException occured, please enter a non negative radius value";

    }
}

class radiusClass extends NegativeRadiusException{
    public static double rediusMethod(int r) throws NegativeRadiusException{
        if(r < 0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r *r;   
    }
}
class divideFunctionClass{
    public static int divideFucntion(int a, int b)throws ArithmeticException{ // Arithmetic exception is an unchecked exception or built exception
        if(b == 0){
            throw new ArithmeticException(); // using throw keyword to throw an exception
        }
        int result = a/b;
        return result;
    }
}

public class throw_vs_throws{
    public static void main(String args[]){

        divideFunctionClass obj1 = new divideFunctionClass();
        int res = obj1.divideFucntion(5, 2);
        // we do not need to include divideFunction inside a try and catch block because Arithmetic exception 
        // is an unchecked exception, but if it was a custom exception then we need to include the function inside 
        // the try catch block
        System.out.println(res);

        radiusClass obj2 = new radiusClass();

        // double ans = obj2.rediusMethod(5); 
        // this wont work because we need to handle this method inside 
        // try and catch block because the class uses a custom exception and not unchecked or built-in exception

        try{
            double ans = obj2.rediusMethod(-5);
            System.out.println(ans);
        }
        catch(NegativeRadiusException e){
            System.out.println(e); // this print what is mentioned inside the toString method, which is usally the Exception name
            System.out.println(e.getMessage());
        }

    }
}
        
