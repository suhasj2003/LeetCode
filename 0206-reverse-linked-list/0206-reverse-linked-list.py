# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        prev = None
        while head is not None:
            head = head.next
            slow.next = prev
            prev = slow
            slow = head
        return prev