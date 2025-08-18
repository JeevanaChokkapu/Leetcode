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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;String palindrome="";
        while(curr!=null)
        {
              palindrome=(String)palindrome+curr.val;
              curr=curr.next;
        }
        String rev=new StringBuilder(palindrome).reverse().toString();
        if(rev.equals(palindrome))
        return true;
        return false;
    }
}