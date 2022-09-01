class Solution {
    public int climbStairs(int n) {
		int ways = 0, prev = 1, prev2 = 1;
		for (int i = 1; i <= n; i++) {
			ways += prev2;
			prev2 = prev;
			prev = ways;
		}
		return ways;
	}
}