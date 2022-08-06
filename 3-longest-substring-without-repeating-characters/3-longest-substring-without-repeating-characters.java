class Solution {
   public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 1)
			return 1;
		HashMap<Character, Integer> charIndex = new HashMap<Character, Integer>();
		int length = 0, start = 0;
		for (int j = 0; j < s.length(); j++) {
			if (!charIndex.containsKey(s.charAt(j))) {
				charIndex.put(s.charAt(j), j);
			} else {
				length = Math.max(j - start, length);
				start = charIndex.get(s.charAt(j)) + 1;
				charIndex.replace(s.charAt(j), j);
				int i = start;
				charIndex.entrySet().removeIf(entry -> (entry.getValue() < i));
			}
			if (j == s.length() - 1) {
				length = Math.max(s.length() - start, length);
			}
		}
		return length;
	}
}