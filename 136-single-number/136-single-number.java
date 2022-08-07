class Solution {
    public int singleNumber(int[] nums) {
		HashSet<Integer> a = new HashSet<Integer>();
		for (int i : nums) {
			if (!a.contains(i)) {
				a.add(i);
			} else {
				a.remove(i);
			}
		}
		for (int i : a) {
			return i;
		}
		return 0;
	}
}