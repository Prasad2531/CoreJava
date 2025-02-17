package org.example.trees;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){}
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

        private Node root;

        //Insert
        private void populate(Scanner scanner){
            System.out.println("Enter the root node: ");
            int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner,root);
        }
        private void populate(Scanner scanner, Node node){
            System.out.print("Enter left child of "+ node.value+": ");
            int left = scanner.nextInt();
            if(left!=0){
                node.left = new Node(left);
                populate(scanner,node.left);
            }
            System.out.print("Enter right child of "+node.value+": ");
            int right = scanner.nextInt();
            if(right!=0){
                node.right=new Node(right);
                populate(scanner,node.right);
            }
        }
        private void display(){
            display(root,"");
        }
        private void display(Node node,String indent){
            if(node==null){
                return;
            }
            System.out.println(indent+node.value);
            display(node.left,indent+"\t");
            display(node.right,indent+"\t");
        }
        private void prettyDisplay(){
            prettyDisplay(root,0);
        }
        private void prettyDisplay(Node node,int level){
            if(node==null){
                return;
            }
            prettyDisplay(node.right,level+1);
            if(level!=0){
                for(int i=0;i<level-1;i++){
                    System.out.print("|\t\t");
                }
                System.out.println("|---->"+node.value);
            }else{
                System.out.println(node.value);
            }
            prettyDisplay(node.left,level+1);
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(scanner);
        bt.display();
        System.out.println("-----------PRETTY-----------");
        bt.prettyDisplay();
    }

}



