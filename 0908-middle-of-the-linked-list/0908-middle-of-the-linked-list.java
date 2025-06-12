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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode curr=head;
        while(curr!=null)
        {
            cnt++;
            curr=curr.next;
        }
        int middle=cnt/2;
        while(middle!=0)
        {
            head=head.next;
            middle--;
        }
        return head;
    }
}