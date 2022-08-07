class Solution {
    public int firstUniqChar(String s) {
		LinkedHashMap<Character, Integer> a = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!a.containsKey(s.charAt(i))) {
				a.put(s.charAt(i), i);
			} else {
				a.replace(s.charAt(i), -1);
			}
		}
		for(int i : a.values()) {
			if (i != -1) {
				return i;
			}
		}
		return -1;
	}
}