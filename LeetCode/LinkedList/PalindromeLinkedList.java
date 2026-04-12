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
    public ListNode reverse(ListNode head){
    
    ListNode next =null;
    ListNode curr =head;
    ListNode prev =null;
    while(curr!=null){
    next =curr.next ;
    curr.next=prev ;
    prev=curr;
    curr=next;
    }
    return prev;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode fast =head;
       ListNode slow =head;
        
ListNode l1= slow;
  while(fast!=null &&fast.next!=null){
fast=fast.next.next;
slow=slow.next ;


  }


ListNode l2= reverse(slow);
  while(l2!=null){
   if(l2.val!=l1.val){return false;}
  l1=l1.next;
  l2=l2.next;
 
  }
  
 

    return true;}

}
