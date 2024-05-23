package org.example.code.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> ans = createSubSet(new int[]{1, 2, 3});
        System.out.println(beautifulSubsets(new int[]{2, 4, 6},2));
//        recursive(new int[]{1,2,3},0,3);
//        for(ArrayList<Integer> num: ans){
//            System.out.println(num);
//        }
    }
    static ArrayList<ArrayList<Integer>> createSubSet(int []arr){
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for (int i = 0; i <n ; i++) {
                ArrayList<Integer>internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
//    static ArrayList<ArrayList<Integer>> recursive(int[] arr,int start,int end){
//        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
//        outer.add(new ArrayList<>());
//    }
    static int beautifulSubsets(int[] arr,int k){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> present = new ArrayList<>(outer.get(i));
                System.out.println(present);
                boolean canAdd=true;
                for(int curr:present){
                    int diff = Math.abs(num-curr);
                    if(diff==k){
                        canAdd=false;
                        break;
                    }
                }
                if (canAdd){
                    present.add(num);
                    outer.add(present);
                }
            }
        }
        return outer.size()-1;
    }
    static ArrayList<ArrayList<Integer>> createSubSetDuplicates(int []arr){
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            for (int j = start; j <=end ; j++) {
                ArrayList<Integer>internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
