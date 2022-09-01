class Solution {
    public int lengthOfLastWord(String s) {
		s = s.trim();
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				return s.substring(i+1).length();
			}
		}
		return s.length();
    }
}