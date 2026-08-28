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
    public ListNode swapPairs(ListNode head) {
        // 1 --> 2 --> 3 --> 4 --> 5 --> 6 
        // 2 --> 1 --> 3 --> 4 --> 5 --> 6
        // 2 --> 1 --> 4 --> 3 --> 5 --> 6
        // 2 --> 1 --> 4 --> 3 --> 6 --> 5
        if(head == null || head.next == null) return head;
        ListNode newHead = head.next;

        head.next = swapPairs(head.next.next);

        newHead.next = head;

        return newHead;

}
}