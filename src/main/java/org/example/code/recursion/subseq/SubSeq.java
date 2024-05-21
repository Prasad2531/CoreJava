package org.example.code.recursion.subseq;

import java.util.ArrayList;

public class SubSeq {

    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));

    }
    //Using Return
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> subSeq2(String output,String input,ArrayList<String>list){
        if(input.isEmpty()){
            list.add(output);
            return list;
        }
        char ch = input.charAt(0);
        subSeq2(output+ch,input.substring(1),list);
        subSeq2(output,input.substring(1),list);
        return list;
    }
    //Subseq with array in body
    static ArrayList<String> subSeqRet(String output,String input){
        if(input.isEmpty()){
            ArrayList<String> list1  = new ArrayList<>();
            list1.add(output);
            return list1;
        }
        char ch = input.charAt(0);
        ArrayList<String> left = subSeqRet(output+ch,input.substring(1));
        ArrayList<String> right = subSeqRet(output,input.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
//        subSeq("","abc");
//        System.out.println(subSeq2("","abc",list));
        System.out.println(subSeqRet("","abc"));
    }
}
