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
   public static ListNode removeNthFromEnd(ListNode head, int n) {
        
		int size = 0;
		ListNode curr = head;
		ListNode prev = null;
		
		while (curr != null) {
			size++;		
			curr = curr.next; 
		}
		
		if (n == size) {
			return head.next;
		}
		
		if (size == 0 && n == 1) {
			return null;
		} else if (size == 0) {
			return head;
		}
		
		curr = head;
		
		for (int i = 1; i <= size - n; i++) {
			prev = curr;
			curr = curr.next;	
		}
		 
		prev.next = curr.next;
		return head;
		
    }
}