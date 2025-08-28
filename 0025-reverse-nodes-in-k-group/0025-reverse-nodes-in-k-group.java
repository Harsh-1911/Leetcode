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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        for(int i =0;i<k;i++){
            if(curr==null){
                return head;
            }
            curr=curr.next;

        }
        curr=head;
        ListNode prev = null;
        for(int i =0;i<k;i++){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;


        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}