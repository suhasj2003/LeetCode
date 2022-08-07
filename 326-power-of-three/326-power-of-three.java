class Solution {
   	public static boolean isPowerOfThree(int n) {
		if (n == 0) return false;
		final double EPSILON = 0.000000000001;
		if (Math.log(n)/Math.log(3) % 1.0 < EPSILON || Math.log(n)/Math.log(3) % 1.0 > (1 - EPSILON)) {
			return true;
		} else return false;
	}

}