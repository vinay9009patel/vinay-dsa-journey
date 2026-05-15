/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        // dummy node for edge cases
        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        // previous unique node
        ListNode prev = dummy;

        // current node
        ListNode curr = head;

        while (curr != null) {

            // duplicate block found
            if (curr.next != null &&
                curr.val == curr.next.val) {

                // skip all duplicates
                while (curr.next != null &&
                       curr.val == curr.next.val) {

                    curr = curr.next;
                }

                // remove entire duplicate block
                prev.next = curr.next;

            } else {

                // move prev only if current node unique
                prev = prev.next;
            }

            // move current forward
            curr = curr.next;
        }

        return dummy.next;
    }
}
