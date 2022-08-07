class Solution {
    public static int[] twoSum(int[] numbers, int target) {
		int a = 0, b = numbers.length - 1, sum;
		while (b > a) {
			sum = numbers[a] + numbers[b];
			if (sum < target) {
				a++;
			} else if (sum > target) {
				b--;
			} else {
				return new int[] { a + 1, b + 1 };
			}
		}
		return new int[2];
	}
}