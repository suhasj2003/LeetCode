class Solution {
  public boolean isValid(String s) {
		if (s.length() == 1) {
			return false;
		}
		Stack<Character> a = new Stack<Character>();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				a.push(s.charAt(i));
				j++;
			} else if (j > 0 && s.charAt(i) == ')' && a.get(j-1) == '(') {
				j--;
				a.pop();
			} else if (j > 0 && s.charAt(i) == ']' && a.get(j-1) == '[') {
				j--;
				a.pop();
			} else if (j > 0 && s.charAt(i) == '}' && a.get(j-1) == '{') {
				j--;
				a.pop();
			} else {
				return false;
			}
		}
		return a.size() == 0 ? true : false;
	}
}