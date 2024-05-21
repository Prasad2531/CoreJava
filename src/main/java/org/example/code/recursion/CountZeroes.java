package org.example.code.recursion;

public class CountZeroes {

    static int countZero(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZero(n/10,count+1);
        }
        return countZero(n/10,count);
    }
    public static void main(String[] args) {
        System.out.println(countZero(1002300300,0));
    }
}
