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

    public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode lastnode = head;
        int length=1;
        while(lastnode.next!=null){
            lastnode =lastnode.next;
            length++;

        }
        lastnode.next=head;
        k=k%length;
        int n =length-k;
        ListNode newtail=head;
        for(int i=1;i<n;i++){
            newtail = newtail.next;



        }
        ListNode newhead = newtail.next;
        newtail.next=null;
        return newhead;

   }
}