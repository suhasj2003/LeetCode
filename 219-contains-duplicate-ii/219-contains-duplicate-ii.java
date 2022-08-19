class Solution {
   public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> a = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (a.containsKey(nums[i])) {
				if (Math.abs(a.get(nums[i]) - i) <= k) {
					return true;
				} else
					a.replace(nums[i], i);
					continue;
			} else {
				a.put(nums[i], i);
			}
		}
		return false;
	}
}