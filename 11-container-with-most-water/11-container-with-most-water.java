class Solution {
    public int maxArea(int[] height) {
		int a = 0, b = height.length - 1;
		int max = 0;
		while (b - a > 0) {
			max = Math.max(max, (b - a) * Math.min(height[a], height[b]));
			if (Math.min(height[a], height[b]) == height[a]) {
				a++;
			} else {
				b--;
			}
		}
		return max;
	}
}