class Solution {
   	public static boolean isPowerOfThree(int n) {
		if (n == 0) return false;
		if (Math.log(n)/Math.log(3) % 1.0 < 0.000000000001 || Math.log(n)/Math.log(3) % 1.0 > (1 - 0.000000000001)) {
			return true;
		} else return false;
	}

}