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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result={-1,-1};
        int minDist=Integer.MAX_VALUE;
        ListNode prev=head;
        ListNode curr=head.next;
        int currIdx=1;
        int prevCriIdx=0;
        int firstCriIdx=0;
        while(curr.next!=null){
            if((curr.val<prev.val&&curr.val<curr.next.val)||(curr.val>prev.val&&curr.val>curr.next.val)){
                if(prevCriIdx==0){
                    prevCriIdx=currIdx;
                    firstCriIdx=currIdx;
                }else{
                    minDist=Math.min(minDist,currIdx-prevCriIdx);
                    prevCriIdx=currIdx;
                }
            }
            currIdx++;
            prev=curr;
            curr=curr.next;
        }
        if(minDist!=Integer.MAX_VALUE){
            int maxDist=prevCriIdx-firstCriIdx;
            result=new int[]{minDist,maxDist};
        }
        return result;
    }
}