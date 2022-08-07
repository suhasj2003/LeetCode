class Solution {
    public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (nums.containsKey(target - numbers[i])) {
				return new int[] { nums.get(target - numbers[i]) + 1, i + 1 };
			} else {
				nums.put(numbers[i], i);
			}
		}
		return new int[] { -1 };
	}
}