class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        expected = sorted(heights)
        return sum(0 if heights[i] == expected[i] else 1 for i in range(len(heights)))