class Solution {
   public static List<Integer> getRow(int rowIndex) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		result.add(1);
		for (int i = 1, j; i <= rowIndex; i++) {
			result.add(1);
			for (j = 1; j < i; j++) {
				if (i != 1) {
					result.add(result.get(j) + result.get(j - 1));
				}
			}
			result.add(1);
			for (j = 0; j < i; j++) {
				result.remove(0);
			}
		}
		return result;
	}
}