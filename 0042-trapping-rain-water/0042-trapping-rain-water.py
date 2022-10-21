class Solution:
    def trap(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1
        start = 0
        end = 0
        res = 0
        while (i < j):
            start = height[i] if start < height[i] else start
            end = height[j] if end < height[j] else end
            if start <= end:
                res += (start - height[i])
                i += 1
            else:
                res += (end - height[j])
                j -= 1
        return res