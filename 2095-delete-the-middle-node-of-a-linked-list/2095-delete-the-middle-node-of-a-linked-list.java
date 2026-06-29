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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slwPtr = head;
        ListNode fastPtr = head;

        if(head.next == null) {
            return null;
        }

        while(fastPtr != null && fastPtr.next !=null) {
            ListNode prev = slwPtr;
            if(fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
            }
            slwPtr = slwPtr.next;
            if(fastPtr == null || fastPtr.next == null) {
                prev.next = slwPtr.next;
                slwPtr.next = null;
            }
        }
        return head;
    }
}