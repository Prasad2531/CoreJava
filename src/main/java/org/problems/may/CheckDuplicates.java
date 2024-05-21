package org.problems.may;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicates {
    //WEEK 1 :
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            if(mp.containsKey(i)){
                return false;
            }
            mp.put(i,1);
        }
        return true;
    }
    // 3 MAY
    public static int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        int n1=version1.length();
        int n2=version2.length();
        int num1=0;
        int num2=0;
        while(i<n1 || j<n2){
            while(i<n1 && version1.charAt(i)!='.'){
                num1=num1*10+(version1.charAt(i)-'0');
                i++;
            }
            while(j<n2 && version2.charAt(j)!='.'){
                num2=num2*10+(version2.charAt(j)-'0');
                j++;
            }
            if(num1>num2){
                return 1;
            }if(num1<num2){
                return -1;
            }
            i++;
            j++;
            num1=0;
            num2=0;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        System.out.println(containsDuplicate(arr));
        System.out.println(compareVersion("7.5.2.4","7.5.3"));

    }
}
