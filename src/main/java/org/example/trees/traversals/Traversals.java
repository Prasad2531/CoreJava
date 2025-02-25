package org.example.trees.traversals;

/*
NODE --> LEFT --> RIGHT
            10
        20      12
      15  4

   OUTPUT: 10 20 15 4 12
 Usecase: Math exp and Serialisation of strings/arrays
 */
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
    }
}
class BT{
    private Node root;

    public BT(){}

    public void populate(int[]nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
    public void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node, int value){
        if(node==null){
            return new Node(value);
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        }
        if(value>node.value){
            node.right=insert(node.right,value);
        }
        return node;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    /*
            LEFT-->NODE-->RIGHT
                    10
                  20   12
                5  4   3
         OP: 5 20 4 10 3 12
         USAGE: In  BST display in sorted order

     */
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    /*
          LEFT-->RIGHT-->NODE
                    10
                  20  12
                15 4  3
           OP: 15 4 20 3 12 10
           USAGE: delete from binary tree(since children must be deleted first)
                  calculating height
     */
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node node){
        if(node==null){
            return;
        }

    }

}
public class Traversals {

    public static void main(String[] args) {
        BT bt = new BT();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        bt.populate(nums);
        System.out.print("PreOrder: ");
        bt.preOrder();
        System.out.println();
        System.out.print("InOrder: ");
        bt.inOrder();
        System.out.println();
        System.out.print("PostOrder: ");
        bt.postOrder();

    }


}
