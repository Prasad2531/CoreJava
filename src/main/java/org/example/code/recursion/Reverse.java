package org.example.code.recursion;

public class Reverse {
    static int num=0;
    //void function
    static void rev(int n){
        if(n%10==n){
            num=num*10+n;
            return ;
        }
        int remainder = n%10;
        num = num*10 + remainder;
        rev(n/10);
    }
    //int function
    static int rev2(int n){
        int digits = (int) (Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem* (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);

    }
    //PALINDROME
    static boolean palindrome(int n){
        return (n==rev2(n));
    }

    public static void main(String[] args) {
        rev(1234);
        System.out.println(num);
        System.out.println(rev2(5678));
        System.out.println(palindrome(1234321));
    }
}
