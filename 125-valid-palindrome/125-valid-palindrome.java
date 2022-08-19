class Solution {
   public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder cleaned = new StringBuilder("");
		for (char c : s.toCharArray()) {
			if (c >= 0 && c < 48 || c >= 91 && c < 97 || c >= 58 && c < 65 ||c >= 123) {
			} else {
				cleaned.append(c);
			}
		}
		if (cleaned.equals("")) {
			return true;
		}
		s = cleaned.toString();
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
				return false;
			}
		}
		return true;
	}
}