// User function Template for Java

class Solution {
    public Node insertAtBegining(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if(head==null)
        {
            return new Node(x);
        }
        newNode.next=head;
        return newNode;
    }
}