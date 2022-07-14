class Solution {
   public String convert(String s, int numRows) {
		StringBuffer a = new StringBuffer();	
		
		if (s == null || s.isEmpty() || numRows < 0) {
			return "";
		} else if (numRows == 1) {
			return s;
		}
		
		int step = 2*(numRows - 1);
		
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < s.length(); j += step) {
				a.append(s.charAt(j));
				if (i != 0 && i != numRows - 1 && (j+step-2*i) < s.length()) {
					a.append(s.charAt(j+step-2*i));
				}
			}
		}
		
		return a.toString();
	}
}