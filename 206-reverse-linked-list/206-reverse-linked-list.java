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
    public  ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode reverse = null;
        
        while (curr != null) {
        	ListNode newNode = new ListNode(curr.val);
        	newNode.next = reverse;
        	reverse = newNode;
        	
        	curr = curr.next;
        }
       
        return reverse;
        
    }

}