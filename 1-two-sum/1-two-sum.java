import java.util.Hashtable;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
		Hashtable<Integer, Integer> a = new Hashtable<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (a.containsKey(target - nums[i])) {
				return new int[]{a.get(target - nums[i]), i};
			} else {
				a.put(nums[i], i);
			}
		}
		return nums;
	}
}