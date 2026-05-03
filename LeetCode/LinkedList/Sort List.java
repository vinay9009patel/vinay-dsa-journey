/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // 1. split into two halves
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid;

        // 2. sort both halves
        left = sortList(left);
        right = sortList(right);

        // 3. merge sorted halves
        return merge(left, right);
    }

    // find middle and split
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // cut the list
        if (prev != null) prev.next = null;

        return slow; // start of right half
    }

    // merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // attach remaining
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
    }
}
