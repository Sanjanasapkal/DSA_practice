/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node p;
        p=head;
        Node q=new Node(x);
        if(p==null)
        {
            return q;
        }
        while(p.next!=null)
        {
            p=p.next;
        }
        
        p.next=q;
        return head;
    }
}