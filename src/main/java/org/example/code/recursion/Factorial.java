package org.example.code.recursion;

public class Factorial {
    static int res = 1;
    static void fact(int n){
        if (n == 1 || n == 0) {
            res = 1;
        } else {
            fact(n - 1);
            res = n * res;
        }
    }

    //reverse a number

    static int rev(int n,int result){
        if(n==0){
            return result;
        }
        int rem = n%10;
        result = result*10 + rem;
        return rev(n/10,result);
    }

    public static void main(String[] args) {
        Factorial.fact(5);
        System.out.println(res);
        System.out.println(rev(-1234,0));

    }
}
