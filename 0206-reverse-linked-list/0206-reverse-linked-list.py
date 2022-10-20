# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        elif head.next is None:
            return head
        fast = head
        slow = head
        prev = None
        while fast is not None:
            fast = fast.next
            slow.next = prev
            prev = slow
            slow = fast
        return prev