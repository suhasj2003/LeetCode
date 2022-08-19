/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode n1 = headA;
		ListNode n2 = headB;
		Set<ListNode> nodeSet = new HashSet<ListNode>();
		while (n1 != null || n2 != null) {
			if (n1 != null) {
				if (nodeSet.contains(n1))
					return n1;
				else
					nodeSet.add(n1);
				n1 = n1.next;
			}	
			if (n2 != null) {
				if (nodeSet.contains(n2))
					return n2;
				else 
					nodeSet.add(n2);
				n2 = n2.next;
			}
		}
		return null;
	}
}