class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        res = []
        sum = 0
        for n in pref:
            sum = sum ^ n
            res.append(sum)
            sum = n
        return res