class Solution {
    public int fib(int n) {
        if (n == 1) return 1;
		int result = 0, prev = 1, prev2 = 1;
		for (int i = 1; i < n; i++) {
			result += prev2;
			prev2 = prev;
			prev = result;
		}
		return result;
	}
}