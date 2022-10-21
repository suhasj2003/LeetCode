class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        count = 0
        expected = list(heights)
        expected.sort()
        for i in range(len(heights)):
            count += 0 if heights[i] == expected[i] else 1
        return count