class Solution {
    public int missingNumber(int[] nums) {
		List<Integer> a = new ArrayList<Integer>();
		for (int i : nums) {
			a.add(i);
		}
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			if (i != a.get(i)) {
				return i;
			}
		}
		return a.size();
	}
}