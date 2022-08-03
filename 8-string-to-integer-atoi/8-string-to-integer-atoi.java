class Solution {
    public static int myAtoi(String s) {
		s = s.trim();
		
        if (s.equals("")) {
			return 0;
		}
            
		char[] numChars = new char[s.length()];
		s.getChars(0, s.length(), numChars, 0);
		
		double sum = 0;
		boolean neg = false;
		
		if (numChars[0] == '-') {
			neg = true;
			numChars[0] = '0';
		} else if (numChars[0] == '+'){
			numChars[0] = '0';
		}
		
		for (char c : numChars) {
			if (c == '0') {
				sum *= 10;
				sum += 0;
			} else if (c == '1') {
				sum *= 10;
				sum += 1;
			} else if (c == '2') {
				sum *= 10;
				sum += 2;
			} else if (c == '3') {
				sum *= 10;
				sum += 3;
			} else if (c == '4') {
				sum *= 10;
				sum += 4;
			} else if (c == '5') {
				sum *= 10;
				sum += 5;
			} else if (c == '6') {
				sum *= 10;
				sum += 6;
			} else if (c == '7') {
				sum *= 10;
				sum += 7;
			} else if (c == '8') {
				sum *= 10;
				sum += 8;
			} else if (c == '9') {
				sum *= 10;
				sum += 9;
			} else {
				break;
			}

		}

		if (sum > Integer.MAX_VALUE) {
			sum = Integer.MAX_VALUE;
			if (neg)
				sum++;
		}

		return (int) (!neg ? sum : -sum);

	}
}