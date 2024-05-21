package org.example.collections;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> arr =  new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i);
        }
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);

        //Linkedlist
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            ll.add(i);
        }
        System.out.println(ll);
        System.out.println(ll.get(2));
        ll.remove(2);
        System.out.println(ll);

        //Vector
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= 5; i++)
            v.add(i);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);

        //Stack
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        stack.pop();        //removes top element
        // Iterator for the stack
        itr = stack.iterator();   //again initialise to 0 index

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }


    }
}
