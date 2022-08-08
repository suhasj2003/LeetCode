class Solution {
  public static String addBinary(String a, String b) {
		StringBuilder x = new StringBuilder(a).reverse();
		StringBuilder y = new StringBuilder(b).reverse();
		StringBuilder result = new StringBuilder();
		int sum = 0;
		int carry = 0;
		for (int i = 0; i < x.length() || i < y.length(); i++) {
			try {
				sum = x.charAt(i) + y.charAt(i) + carry;
			} catch (IndexOutOfBoundsException e) {
				try {
					sum = x.charAt(i) + 48 + carry;
				} catch (IndexOutOfBoundsException f) {
					sum = y.charAt(i) + 48 + carry;
				}
			}
			if (sum > 97) {
				carry = 1;
				sum -= 2;
			} else {
				carry = 0;
			}
			result.append(sum - 96);
			sum = 0;
		}
		if (carry == 1) {
			result.append(1);
		}
		return result.reverse().toString();
	}

}