class Solution {
    public int[] singleNumber(int[] nums) {
		HashSet<Integer> a = new HashSet<Integer>();
		for (int i : nums) {
			if(a.contains(i)) {
				a.remove(i);
			} else {
				a.add(i);
			}
		}
		int[] result = new int[2];
		int index = 0;
		for (Integer i : a) {
			result[index++] = i;			
		}
		return result;
	}

}