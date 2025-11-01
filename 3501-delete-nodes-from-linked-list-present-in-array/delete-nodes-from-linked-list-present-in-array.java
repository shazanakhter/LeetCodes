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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        Set<Integer> numbers=new HashSet<>();
        for(int n: nums){
            numbers.add(n);
        }
        while(curr!=null){
            if(numbers.contains(curr.val)){
                if(prev==null){
                    head=head.next;
                }else{
                    prev.next=curr.next;
                }
            }else{
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}