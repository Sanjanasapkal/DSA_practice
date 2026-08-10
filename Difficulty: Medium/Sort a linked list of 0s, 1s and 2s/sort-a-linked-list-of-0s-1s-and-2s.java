/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node p=head;
        int count0=0,count1=0,count2=0;
        while(p!=null)
        {
            if(p.data==1)
            {
                count1++;
            }
            else if(p.data==2)
            {
                count2++;
            }
            else if(p.data==0)
            {
                count0++;
            }
            p=p.next;
        }
        p=head;
        while(p!=null)
        {
            while(count0>0)
            {
                p.data=0;
                p=p.next;
                count0--;
            }
            while(count1>0)
            {
                p.data=1;
                p=p.next;
                count1--;
            }
            while(count2>0)
            {
                p.data=2;
                p=p.next;
                count2--;
            }
        }
        return head;
    }
}