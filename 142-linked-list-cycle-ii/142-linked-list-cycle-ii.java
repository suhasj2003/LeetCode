/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
		HashSet<ListNode> nodes = new HashSet<ListNode>();
		while(head != null) {
			if (nodes.contains(head.next)) {
				return head.next;
			}
			nodes.add(head);
			head = head.next;
		}
		return null;
	}
    
}