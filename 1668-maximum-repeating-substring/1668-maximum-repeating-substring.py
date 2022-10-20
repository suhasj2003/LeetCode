class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        i = 0
        while i * word in sequence:
            i += 1
        return i - 1