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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode li1=list1;
        ListNode li2=list2;
        ListNode temp=new ListNode(-1);
        ListNode curr=temp;
        if(list1==null &&list2!=null )
        return list2;
        if(list2==null && list1!=null)
        return list1;

        while(li1!=null && li2!=null)
        {
           if(li1.val<=li2.val)
           {
            curr.next=new ListNode(li1.val);
            li1=li1.next;
            curr=curr.next;
           }
           else
           {
            curr.next=new ListNode(li2.val);
            li2=li2.next;
            curr=curr.next;
           }
        }
        while(li1!=null)
        {
            curr.next=new ListNode(li1.val);
            li1=li1.next;
            curr=curr.next;
        }
        while(li2!=null)
        {
             curr.next=new ListNode(li2.val);
            li2=li2.next;
            curr=curr.next;
        }

return temp.next;
    }
}