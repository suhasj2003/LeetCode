# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = head
        fast = head.next
        if fast is None:
            return None
        count = 0
        while fast is not None:
            if count >= n:
                 slow = slow.next               
            count += 1
            fast = fast.next
        if count == (n - 1):
            return head.next
        slow.next = slow.next.next
        return head
        