class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        sum = 0
        for i,n in enumerate(columnTitle):
            sum += ((ord(n)-64) * 26**(len(columnTitle) - (i+1)))
        return sum