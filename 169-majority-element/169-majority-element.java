class Solution {
   	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int count = 0, number = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != number) {
				if (count > nums.length/2) {
					return number;
				} else {
					number = nums[i];
				}
			}
			count++;
		}
		return number;
	}
}