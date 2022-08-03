class Solution {
    public int reverse(int x) {
		
		String num = String.valueOf(x);
		String result = "";
		
		if (num.charAt(0) == '-') {
			num = num.substring(1, num.length());
			result += '-';
		}
		
		char[] numChars = new char[num.length()];
		num.getChars(0, num.length(), numChars, 0);
		
		for(int i = numChars.length - 1; i >= 0; i--) {
			result += numChars[i];
		}
		
		try {
			return Integer.valueOf(result);
		} catch (IllegalArgumentException e) {
			return 0;
		}
	}
}