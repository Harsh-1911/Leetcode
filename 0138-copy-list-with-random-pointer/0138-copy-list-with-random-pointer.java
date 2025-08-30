/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;

        }
        Node temp = head;

        while (temp!= null){
            Node nextpart = temp.next;
            Node copyNode = new Node (temp.val);
            temp.next = copyNode;
            copyNode.next = nextpart;
            temp = nextpart;



        }
        temp = head;
        while(temp!= null){
            Node copyNode = temp.next;
            if(temp.random!=null){
                copyNode.random = temp.random.next;
                
            }
            else {
                copyNode.random=null;
            }
            temp=temp.next.next;
        }
        temp = head;
        Node dummy = new Node(-1);
        Node copyHead = dummy;
        while (temp != null) {
            copyHead.next = temp.next;
            copyHead = copyHead.next;

            temp.next = temp.next.next; // restore original
            temp = temp.next;
        }

        return dummy.next; // head of cloned list

        
    }
}