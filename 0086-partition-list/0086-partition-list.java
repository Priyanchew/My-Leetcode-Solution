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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode headLeft  = left;
        ListNode headRight =right;
        ListNode run = head;

        while(run != null){
            if(run.val < x){
                left.next = new ListNode(run.val);
                left = left.next;
            }else{
                right.next = new ListNode(run.val);
                right = right.next;
            }
            run = run.next;
        }
        left.next = headRight.next;
        return headLeft.next;
    }
}