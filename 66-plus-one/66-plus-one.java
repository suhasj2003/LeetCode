class Solution {
   public static int[] plusOne(int[] digits) {
		digits[digits.length-1] += 1;
		for (int i = digits.length-1; i >= 0; i--) {
			if (digits[0] == 10) {
				digits[0] = 0;
				int[] temp = new int[digits.length + 1];
				temp[0] = 1;
				for (int j = 0; j < digits.length; j++) {
					temp[j+1] = digits[j];
				}
				return temp;
			}
			
			if (digits[i] == 10) {
				digits[i] = 0;
				digits[i-1] += 1;
			}
		}
		return digits;
	}
}