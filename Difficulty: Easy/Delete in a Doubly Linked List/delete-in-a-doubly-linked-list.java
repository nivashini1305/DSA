/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null)
        {
            return null;
        }
        Node temp=head;
        int count=0;
        while(temp != null)
        {
            count++;
            if(count==x)  break;
            temp=temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;
        if(front == null && back == null)
        {
            return null;
        }
        else if(back == null)
        {
            Node first = head;
            head = head.next;
            head.prev=null;
            first.next=null;
            return head;
        }
        else if(front == null)
        {
            Node tail=head;
            while(tail.next != null)
            {
                tail = tail.next;
            }
            Node newNode = tail.prev;
            newNode.next = null;
            tail.prev = null;
            return head;
        }
        back.next=front;
        front.prev=back;
        temp.next=null;
        temp.prev=null;
        return head;
       
    }
}