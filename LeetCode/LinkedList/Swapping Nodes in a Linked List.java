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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstPointer = head;
      for(int i=0 ;i<k-1 ;i++){
        firstPointer =firstPointer.next;
      }  
        ListNode curr = firstPointer.next;
        ListNode secondPointer = head;
        while(curr!=null){
           curr= curr.next;
           secondPointer=secondPointer.next;


        }

        int temp = secondPointer.val;
        secondPointer.val=firstPointer.val;
        firstPointer.val=temp;



        return head;
    }
}
