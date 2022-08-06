class Solution {
   public static void reverseString(char[] s) {
		char a;
		int i = 0;
		for(; i < s.length/2; i++) {
			a = s[i];
			s[i] = s[s.length - (i+1)];
			s[s.length - (i+1)] = a;
		}
	}
}