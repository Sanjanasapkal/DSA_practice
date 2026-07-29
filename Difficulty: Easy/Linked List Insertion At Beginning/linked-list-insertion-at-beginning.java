/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node p;
        p=head;
        Node q=new Node(x);
        head=q;
        head.next=p;
        return head;
    }
}