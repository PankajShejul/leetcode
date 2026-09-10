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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode newHead = dummy;
        ListNode slwPtr = dummy;
        int j=0;
        while(dummy.next!=null) {
            dummy=dummy.next;
            j++;
            if(j > n) {
                slwPtr = slwPtr.next;
            }
        }
        
        if(slwPtr.next !=null) {
            ListNode temp = slwPtr.next.next;
            slwPtr.next = temp;
        }
        return newHead.next;
    }
}