package org.dp;

import java.util.HashMap;
import java.util.Map;

public class Dp {
    public static void main(String[] args) {
//        System.out.println(fibonacci(10));
//        System.out.println(fibonacciTopDown(7));
        System.out.println(fibonaccii(7));
//        System.out.println(fibonacciBottomUp(7));
    }
    //Recursive call O(2^n)
    private static long fibonacci(int i) {
        if(i<2) return i;
        else return fibonacci(i-1)+fibonacci(i-2);
    }
    //Memoization: Storing the result in cache to use later if needed
    //Top-Down
    //O(n)
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonaccii(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result =  fibonaccii(n-1) + fibonaccii(n-2);
        memo.put(n, result);
        return result;
    }
    private static long fibonacciTopDown(int n){
        return fibonacciTopDownHelper(n,new long[n+1]);
    }

    private static long fibonacciTopDownHelper(int n, long[] memo) {
        if(n<2) return n;
        if(memo[n]==0){
            memo[n]=fibonacciTopDownHelper(n-1,memo)+fibonacciTopDownHelper(n-2,memo);
            System.out.println(memo[n]);
        }
        return memo[n];
    }

    //Tabulation
    //Bottom-Up : Table is created from bottom-up

    private static long fibonacciBottomUp(int n){
        if(n<2) return n;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(long i: dp){
            System.out.println(i);
        }
        return dp[n];
    }
}

class LCS{
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde","epo"));
    }
    private static int longestCommonSubsequence(String text1,String text2){
        int row = text1.length();
        int col = text2.length();
        int[][] dp = new int[row+1][col+1];
        for (int i = row-1;i>=0; i--) {
            for(int j=col-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}

class ClimbingStairs{
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    //SC: O(n) TC: O(n)
    private static int climbStairs(final int n){
        int[] dp = new int[n+1];
        dp[n] = 1;
        dp[n-1]=1;
        for(int i=n-2;i>=0;i--){
            dp[i]=dp[i+2]+dp[i+1];
        }
        return dp[0];
    }
}
