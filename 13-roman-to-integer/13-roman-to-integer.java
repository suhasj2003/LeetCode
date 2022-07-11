class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] numerals = new char[s.length()];
            s.getChars(0, s.length(), numerals, 0);       
        
        for(int i = 0; i < numerals.length; i++) {
            if (i != numerals.length-1) {
                if (numerals[i] == 'I') {
                    if (numerals[i+1] == 'X') {
                        sum += 9;
                        ++i;
                        continue;
                    } else if (numerals[i+1] == 'V') {
                        sum += 4;
                         ++i;
                        continue;
                    } else {
                        sum += 1;
                    }
                } else if (numerals[i] == 'V') {
                    sum += 5;
                } else if (numerals[i] == 'X') {
                    if (numerals[i+1] == 'C') {
                        sum += 90;
                         ++i;
                        continue;
                    } else if (numerals[i+1] == 'L') {
                        sum += 40;
                         ++i;
                        continue;
                    } else {
                        sum += 10;
                    }
                } else if (numerals[i] == 'L') {
                    sum += 50;
                } else if (numerals[i] == 'C') {
                    if (numerals[i+1] == 'M') {
                        sum += 900;
                         ++i;
                        continue;
                    } else if (numerals[i+1] == 'D') {
                        sum += 400;
                         ++i;
                        continue;
                    } else {
                        sum += 100;
                    }
                } else if (numerals[i] == 'D') {
                    sum += 500;
                } else if (numerals[i] == 'M') {
                    sum += 1000;
                }
            } else {
                
                switch(numerals[i]) {
                    case 'I': 
                        sum += 1;
                        break;
                    case 'V': 
                        sum += 5;
                        break;
                    case 'X': 
                        sum += 10;
                        break;
                    case 'L': 
                        sum += 50;
                        break;
                    case 'C': 
                        sum += 100;
                        break;
                    case 'D': 
                        sum += 500;
                        break;
                    case 'M': 
                        sum += 1000;
                        break;                        
                }
                
            }
        }
            return sum;
    }
}