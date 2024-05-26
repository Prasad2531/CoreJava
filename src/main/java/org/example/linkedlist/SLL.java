package org.example.linkedlist;

class Node{
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class SLL {
    private Node head=null;
    private void add(int value){
        if(head==null){
            head= new Node(value);
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }
    private void delete(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node curr = head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            if(curr.next!=null){
                curr.next=curr.next.next;
            }

        }
    }
    private static void display(Node temp){
        while(temp.next!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(temp.value);
    }

    private int length(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    private boolean search(int value){
        Node temp=head;
        while(temp!=null && temp.value!=value){
            temp=temp.next;
        }
        return temp!=null;
    }
    private static Node reverse(Node curr){
        Node prev=null;
        while(curr!=null){
            Node newNext = curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNext;
        }
        return prev;
    }
    /*
    To reverse a ll using recursion
    1->2-3->null
    solve  2->3->null
    solve    3->null
    Now head->next==null so return newHead= 3 ,so 3->null return |3|
     call comes back here:     2 -> 3       --     x<-2<-3    and return newHead=3 so 3->2->x is returned
                             head  front
     call come here   x<-2<-3 = reverse(1.next) so curr=1
                    front(2)=1->next     1-> 2<-3  front.next=curr   1<-2<-3 curr.next=null x<-1<-2<-3 return newHead=3
                                         /
                                        x
     */
    private static Node recursiveReverse(Node curr){
        if(curr==null || curr.next==null){
            return curr;
        }
        Node newHead = recursiveReverse(curr.next);
        Node front = curr.next;
        front.next=curr;
        curr.next=null;
        return newHead;
    }
    private static int middle(Node temp){
        Node slow=temp;
        Node fast=temp;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.value;
    }
    private static Node swapPairs(Node head) {
        Node slow=head;
        Node fast=slow.next;
        while(fast!=null && slow!=null){
            int curr = slow.value;
            slow.value=fast.value;
            fast.value=curr;
            fast=fast.next.next;
            slow=slow.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        SLL newlist = new SLL();
        SLL second = new SLL();
        newlist.add(10);
        newlist.add(20);
        newlist.add(30);
        newlist.add(40);
        second.add(1);
        second.add(2);
        second.add(3);
        second.add(4);
        display(newlist.head);
        display(second.head);
//        System.out.println(newlist.length());
//        newlist.delete(2);
//        display(newlist.head);
//        System.out.println(newlist.length());
//        System.out.println(newlist.search(40));
//        Node temp = reverse(newlist.head);
//        display(temp);
//        System.out.println(middle(newlist.head));
//        System.out.println(middle(second.head));
//        display(recursiveReverse(second.head));
        display(swapPairs(newlist.head));
        display(swapPairs(second.head));
    }
}
