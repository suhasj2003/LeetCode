class Solution {
   public void sortColors(int[] nums) {
		int red, white;
		red = white = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				red++;
			} else if (nums[i] == 1) {
				white++;
			} 
		}
		white += red;
		for (int i = 0; i < nums.length; i++) {
			if (i < red) {
				nums[i] = 0;
			} else if (i < white) {
				nums[i] = 1;
			} else {
				nums[i] = 2;
			}
		}
	}
}