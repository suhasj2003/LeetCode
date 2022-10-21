class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        return sum(1 if s.startswith(x) else 0 for x in words)