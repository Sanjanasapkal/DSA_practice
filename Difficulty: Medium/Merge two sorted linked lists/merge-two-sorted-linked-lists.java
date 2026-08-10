class Solution {
    Node sortedMerge(Node head1, Node head2) {

        Node head = null;
        Node p = null;

        while (head1 != null && head2 != null) {

            Node q;

            if (head1.data < head2.data) {
                q = head1;
                head1 = head1.next;
            } else {
                q = head2;
                head2 = head2.next;
            }

            if (head == null) {
                head = q;
                p = q;
            } else {
                p.next = q;
                p = q;
            }
        }

        if (head1 != null)
            p.next = head1;

        if (head2 != null)
            p.next = head2;

        return head;
    }
}