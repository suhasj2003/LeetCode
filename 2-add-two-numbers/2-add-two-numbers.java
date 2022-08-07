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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
		int sum;
      if (l1 != null && l2 != null && l1.next == null && l2.next == null) {
          sum = l1.val + l2.val;
          result.val = sum < 10 ? sum : sum - 10;
          result.next = sum < 10 ? null : new ListNode(1);
          return result;
        } else if (l1 == null && l2 == null) {
          return null;
        } else if (l2 == null) {
			result.val = l1.val < 10 ? l1.val : l1.val - 10;
			if (l1.next != null) {
				result.next = l1.val < 10 ? addTwoNumbers(l1.next, null) : addTwoNumbers(new ListNode(l1.next.val + 1, l1.next.next), null);
			} else {
				result.next = l1.val < 10 ? null : new ListNode(1);
			}
			return result;
		} else if (l1 == null) {
			result.val = l2.val < 10 ? l2.val : l2.val - 10;
			if (l2.next != null) {
				result.next = l2.val < 10 ? addTwoNumbers(null, l2.next) : addTwoNumbers(null, new ListNode(l2.next.val + 1, l2.next.next));
			} else {
				result.next = l2.val < 10 ? null : new ListNode(1);
			}
			return result;
		}
		sum = l1.val + l2.val;
		if (sum > 9) {
			sum -= 10;
			result.val = sum;
            try {
                result.next = addTwoNumbers(new ListNode(l1.next.val + 1, l1.next.next), l2.next);
            } catch (NullPointerException e) {
                result.next = addTwoNumbers(l1.next, new ListNode(l2.next.val + 1, l2.next.next));
            }
			
		} else {
			result.val = sum;
			result.next = addTwoNumbers(l1.next, l2.next);
		}
		return result;
	}	
}