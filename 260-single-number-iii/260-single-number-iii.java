class Solution {
   public int[] singleNumber(int[] nums) {
		int num1 = 0, num2 = 0, bitSum = 0, i = 0;
		for (int j : nums) {
			bitSum ^= j;
		}
		while ((bitSum & 1) == 0) {
			i++;
			bitSum >>= 1;
		}
		for (int j : nums) {
			if (((j >> i) & 1) == 0) {
				num1 ^= j;
			} else {
				num2 ^= j;
			}
		}
		return new int[] {num1, num2};
	}

}