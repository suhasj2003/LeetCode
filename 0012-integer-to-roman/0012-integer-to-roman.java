class Solution {
   public static String intToRoman(int num) {

		int[] digits = new int[5];
		String romanNumeral = "";

		digits[0] = num / 1000;
		num %= 1000;
		digits[1] = num / 100;
		num %= 100;
		digits[2] = num / 10;
		num %= 10;
		digits[3] = num / 1;

	

		for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j < digits[i]; j++) {
				switch (i) {
				case 0:
					romanNumeral += "M";
					break;
				case 1:
					if (digits[i] == 9) {
						romanNumeral += "CM";
						j = digits[i];
						break;
					} else if (digits[i] == 4) {
						romanNumeral += "CD";
						j = digits[i];
						break;
					} else if (digits[i] >= 5) {
						romanNumeral += "D";
						digits[i] -= 5;
						j = -1;
						break;
					}
					romanNumeral += "C";
					break;
				case 2:
					if (digits[i] == 9) {
						romanNumeral += "XC";
						j = digits[i];
						break;
					} else if (digits[i] == 4) {
						romanNumeral += "XL";
						j = digits[i];
						break;
					} else if (digits[i] >= 5) {
						romanNumeral += "L";
						digits[i] -= 5;
						j = -1;
						break;
					}
					romanNumeral += "X";
					break;
				case 3:
					if (digits[i] == 9) {
						romanNumeral += "IX";
						j = digits[i];
						break;
					} else if (digits[i] == 4) {
						romanNumeral += "IV";
						j = digits[i];
						break;
					} else if (digits[i] >= 5) {
						romanNumeral += "V";
						digits[i] -= 5;
						j = -1;
						break;
					}
					romanNumeral += "I";
					break;
				}

			} 
		}
		System.out.println(romanNumeral);
		return romanNumeral;

	}
}