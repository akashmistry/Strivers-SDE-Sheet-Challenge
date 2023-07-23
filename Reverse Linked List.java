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
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;//left pointer
        while(head!=null){
            ListNode next = head.next;//right pointer
            head.next = newHead;
            newHead = head;
            head = next;//head is the middle pointer
        }
        return newHead;
    }
}