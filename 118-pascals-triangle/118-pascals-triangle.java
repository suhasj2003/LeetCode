class Solution {
   public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		result.add(Arrays.asList(1));
		for (int i = 1; i < numRows; i++) {
			List<Integer> array = new ArrayList<Integer>(i + 1);
			array.add(1);
			for (int j = 1; j < i; j++) {
				array.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
			}
			array.add(1);
			result.add(array);
		}
		return result;
	}
}