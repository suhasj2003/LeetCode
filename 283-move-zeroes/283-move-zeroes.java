class Solution {
    public void moveZeroes(int[] nums) {
		for (int i = 0, available = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[available] = nums[i];
				nums[i] = (available != i) ? (nums[i] = 0) : nums[available];
				available++;
			}
		}
	}
}