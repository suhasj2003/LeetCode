# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        nums = set()
        visited = deque([root])
        while visited:
            curr = visited.popleft()
            if curr is None:
                continue
            if k - curr.val in nums:
                return True
            nums.add(curr.val)
            visited.append(curr.left)
            visited.append(curr.right)
        return False