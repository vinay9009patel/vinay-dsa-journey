class Solution {

    ListNode removeLast(ListNode head) {

        if (head.next == null) return head;

        ListNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        ListNode last = temp.next;
        temp.next = null;

        return last;
    }

    ListNode addFirst(ListNode head, ListNode node) {
        node.next = head;
        return node;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) return head;

 
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

   
        k = k % n;

        
        while (k-- > 0) {
            ListNode last = removeLast(head);
            head = addFirst(head, last);
        }

        return head;
    }
}
