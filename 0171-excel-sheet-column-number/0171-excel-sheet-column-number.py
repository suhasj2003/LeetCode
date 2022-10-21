class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        sum = 0
        for i,n in enumerate(columnTitle):
            sum *= 26
            sum += (ord(n)-64)
        return sum