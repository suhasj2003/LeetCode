class Solution {
    public boolean isHappy(int n) {
		if (n == 2 || n == 3 || n == 4 || n == 5 || n == 6) return false;
	    if (n == 1) return true;
		int sum = 0;
		while (n > 0) {
			sum += (int) Math.pow(n % 10, 2);
			n /= 10;
		}
		return isHappy(sum);
	}

}