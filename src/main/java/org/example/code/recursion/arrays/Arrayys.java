package org.example.code.recursion.arrays;

import java.util.ArrayList;

public class Arrayys {
    //1.CHECK IF ARRAY IS SORTED
    static boolean sorted(int [] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
    //2. LINEAR SEARCH WITH RECURSION
    static int checker(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return checker(arr,target,index-1);
    }
    //3.FIND ALL INDEX
    static ArrayList<Integer>list = new ArrayList<>();
    static void findAll(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAll(arr,target,index+1);
    }
    //3.1 RETURNING LIST
    static ArrayList<Integer> findAll2(int[] arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAll2(arr,target,index+1,list);
    }
    //3.2 FIND ALL WITH CREATING LIST INSIDE (NOT OPTIMISED) DONT USE
    static ArrayList<Integer> findAll2Ret(int[] arr,int target,int index){
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> belowAllValues = findAll2Ret(arr,target,index+1);
        list.addAll(belowAllValues);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
        int[] vec = {1,2,3,5,6,4};
        System.out.println(sorted(vec,0));
        int[] arr2 = {1,2,3,4,3,5,6};
        System.out.println(checker(arr2,1,arr.length-1));
        findAll(arr2,3,0);
        System.out.println(list);
        ArrayList<Integer>list2 = new ArrayList<>();
        System.out.println(findAll2(arr2,3,0,list2));
        System.out.println(findAll2Ret(arr2,4,0));
    }
}
