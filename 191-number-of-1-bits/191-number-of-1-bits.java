public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
		
		int ones = 0;
		int check = 1;
		
		for (int i = 0; i < 32; i++) {
			if ((n & check) != 0) {
				ones++;
			}
			check <<= 1;
		}
		
		return ones;
	}

}