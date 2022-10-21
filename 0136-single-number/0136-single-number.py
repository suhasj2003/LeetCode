class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return reduce(lambda res, itr : res ^ itr, nums)
        