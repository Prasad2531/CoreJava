package org.example.linkedlist;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class SLL {
    private Node head = null;

    private void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    private void delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            if (curr.next != null) {
                curr.next = curr.next.next;
            }

        }
    }

    private static void display(Node temp) {
        while (temp.next != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    private int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private boolean search(int value) {
        Node temp = head;
        while (temp != null && temp.value != value) {
            temp = temp.next;
        }
        return temp != null;
    }

    private static Node reverse(Node curr) {
        Node prev = null;
        while (curr != null) {
            Node newNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNext;
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
    private static Node recursiveReverse(Node curr) {
        if (curr == null || curr.next == null) {
            return curr;
        }
        Node newHead = recursiveReverse(curr.next);
        Node front = curr.next;
        front.next = curr;
        curr.next = null;
        return newHead;
    }

    private static Node middle(Node temp) {
        Node slow = temp;
        Node fast = temp;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private static Node reverseFromMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return reverse(slow);
    }
    private static int pairSum(Node head) {
        Node curr=head;
        Node fast=head;
        Node slow=head;
        while( fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverse(slow);
        int max_sum=0;
        while(temp!=null){
            int sum = curr.value + temp.value;
            max_sum=Math.max(max_sum,sum);
            curr=curr.next;
            temp= temp.next;
        }
        return max_sum;
    }

//    private static Node swapPairs(Node head) {
//
//    }

    private static int loopLength(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }
        //Add your code here.
        Node slow = head;
        Node fast = head;

        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return 0;
        } else {
            int count = 1;
            Node temp = slow;
            while (temp.next != slow) {
                temp = temp.next;
                count++;
            }

            return count;
        }
    }

    private static boolean palindrome(Node head) {
        Node mid = middle(head);
        Node temp = reverse(mid);
        Node curr = head;
        while (temp != null) {
            if (curr.value != temp.value) {
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }
        return true;

    }

    public static void main(String[] args) {
        SLL newlist = new SLL();
        SLL second = new SLL();
        newlist.add(10);
        newlist.add(20);
        newlist.add(30);
        newlist.add(40);
//        System.out.println(pairSum(newlist.head));
//        display(middle(newlist.head));
//        display(reverseFromMiddle(newlist.head));
//        second.add(1);
//        second.add(2);
//        second.add(3);
//        second.add(4);
//        second.add(5);
//        second.add(6);
//        second.add(7);
//        Node cycleNode = null;
//        Node temp=second.head;
//        while(temp!=null){
//            if(temp.value==2){
//                cycleNode=temp;
//                break;
//            }
//            temp=temp.next;
//        }
//        if(cycleNode!=null){
//            temp=second.head;
//            while(temp.next!=null){
//                temp=temp.next;
//            }
//            temp.next=cycleNode;
//        }
//        System.out.println(loopLength(second.head));
//        SLL third = new SLL();
//        third.add(1);
//        third.add(2);
////        third.add(3);
//        third.add(2);
//        third.add(1);
//        display(third.head);
//        System.out.print("From middle: ");
//        display(middle(third.head));
////        display(recursiveReverse(third.head));
//        Node temp2= third.head;
//        System.out.println();
//        Node temp= middle(temp2);
//        display(recursiveReverse(temp));
//        System.out.print("Is Palindrome: ");
//        System.out.println(palindrome(third.head));
//        display(recursiveReverse(third.head));

//        display(newlist.head);
//        display(second.head); //check if second is cyclic
//        System.out.println(newlist.length());
//        newlist.delete(2);
//        display(newlist.head);
//        System.out.println(newlist.length());
//        System.out.println(newlist.search(40));
//        Node temp = reverse(newlist.head);
//        display(temp);
//        System.out.println(middle(newlist.head).value);
//        System.out.println(middle(second.head).value);
//        display(recursiveReverse(second.head));
//        display(swapPairs(newlist.head));
//        display(swapPairs(second.head));


    }
}
