import java.util.*;

class invalidInputException extends Exception {
    public String toString() {
        return "Invlaid input, Please enter a valid input";
    }
}

class cannotDivideByZeroException extends Exception {
    public String toString() {
        return "You cannot divide a number by Zero";
    }
}

class maxInputException extends Exception {
    public String toString() {
        return "You can not input a number greater than 100000";
    }
}

class maxMultiplierException extends Exception {
    public String toString() {
        return "You cannot input multiplier greater than 10000";
    }
}

class cannotDivideByZero extends Exception {
    public String toString() {
        return "You cannot divide a number by zero";
    }
}

class calculatorClass {
    public int add(int a, int b) throws maxInputException {
        return a + b;
    }

    public int mul(int a, int b) throws maxMultiplierException, maxInputException {
        return a * b;
    }

    public int sub(int a, int b) throws maxInputException {
        return a - b;
    }

    public int div(int a, int b) throws cannotDivideByZeroException, maxInputException {
        return a / b;
    }

}

public class calculator_exception {
    public static void main(String args[]) {
        calculatorClass obj1 = new calculatorClass();
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        int user_option;
        int res;
        boolean flag = true;
        while (flag) {
            System.out.println("Choose which operation you want to implement\n 1.add\n 2.mul \n 3.sub \n 4.div");
            user_option = sc.nextInt();
            if (user_option == 1 || user_option == 2 || user_option == 3 || user_option == 4) {
                System.out.println("Enter the values for a and b");
                a = sc.nextInt();
                b = sc.nextInt();
                try {
                    if (a > 100000 || b > 100000) {
                        throw new maxInputException();
                    }
                    switch (user_option) {
                        case 1:
                            res = obj1.add(a, b);
                            System.out.println(res);
                            flag = false;
                            break;
                        case 2:
                            if (a > 10000 || b > 10000) {
                                throw new maxMultiplierException();
                            } else {
                                res = obj1.mul(a, b);
                                System.out.println(res);
                                flag = false;
                                break;
                            }
                        case 3:
                            res = obj1.sub(a, b);
                            System.out.println(res);
                            flag = false;
                            break;
                        case 4:
                            if (b == 0) {
                                //flag = false; keep this if want the program to end after user enters b value to be 0
                                throw new cannotDivideByZeroException();
                                
                            } else {
                                res = obj1.div(a, b);
                                System.out.println(res);
                                flag = false;
                                break;
                            }
                    }
                } catch (maxInputException m1) {
                    System.out.println(m1);
                } catch (maxMultiplierException m2) {
                    System.out.println(m2);
                } catch (cannotDivideByZeroException m3) {
                    System.out.println(m3);
                }
            } else {
                System.out.println("Please choose a valid option");
            }
        }

    }

}
