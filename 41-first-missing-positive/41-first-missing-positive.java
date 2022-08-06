class Solution {
    public int firstMissingPositive(int[] nums) {
		HashSet<Integer> number = new HashSet<Integer>();
		for (int n : nums) {
			number.add(n);
		}
		for (int i = 1; i <= nums.length; i++) {
			if(!number.contains(i)) {
				return i;
			}
		}
		return nums.length + 1;		
	}
}