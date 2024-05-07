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
    public ListNode doubleIt(ListNode head) {
        ListNode temp=head;
        if(head.val>4){
            ListNode node=new ListNode(1);
            node.next=head;
            head=node;
        }
        while(temp!=null){
            int carry=0;
            if(temp.next!=null&&temp.next.val>4){
                carry=1;
            }
            int newVal=(temp.val*2+carry)%10;
            temp.val=newVal;
            temp=temp.next;
        }
        return head;
    }
}