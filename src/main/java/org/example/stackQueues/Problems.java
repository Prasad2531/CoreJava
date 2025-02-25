package org.example.stackQueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class Problems {

    public static void main(String[] args)  {
        //Q1. Implement Queues using Stacks
        /**
         * Your MyQueue object will be instantiated and called as such:
         * MyQueue obj = new MyQueue();
         * obj.push(x);
         * int param_2 = obj.pop();
         * int param_3 = obj.peek();
         * boolean param_4 = obj.empty();
         */
        MyQueue obj = new MyQueue();
        obj.push(1);
        int y = obj.peek();

        boolean isEmpty = obj.empty();
        System.out.println(isEmpty);

        System.out.println(obj.pop());
    }



}
//Q1. Implement Queues using Stacks
class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() throws EmptyStackException{
        while(first.size()!=1){
            second.push(first.pop());
        }
        int x = first.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return x;

    }

    public int peek() throws EmptyStackException{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int x = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return x;

    }

    public boolean empty() {
        return first.isEmpty();
    }
}

