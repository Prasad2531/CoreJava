package org.example.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        //int c=a/b; //Throws ArithmeticException
        try{
//            int c=a/b;
            divide(a,b);
        }catch(ArithmeticException e){
            System.out.println("Specific exception!"); //More specific exceptions must be before general exception orelse it throws error
        }catch(Exception e){
            System.out.println("normal exception!"); //does not throws exception just prints the message
        }finally {
            System.out.println("This will execute everytime!");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero!");
        }
        return a/b;
    }
}
