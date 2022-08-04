public class Solution {
    // you need treat n as an unsigned value
   public int reverseBits(int n) {
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			sum <<= 1;
			if ((n & 1) != 0) {
				sum ^= 1;
			}
			n >>>= 1;
		}
		return sum;
	}
}