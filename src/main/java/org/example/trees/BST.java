package org.example.trees;

import java.util.Scanner;

public class BST {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BST(){}

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void populate(int[]nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
    private void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node==null){
            return new Node(value);
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        }
        if(value>node.value){
            node.right=insert(node.right,value);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    private void display(){
        display(root,"Root is: ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left child of "+node.value+" is : ");
        display(node.right,"Right child of "+node.value+" is : ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bt = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        bt.populate(nums);
        bt.display();
    }
}
