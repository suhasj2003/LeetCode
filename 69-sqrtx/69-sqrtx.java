class Solution {
    public static int mySqrt(int x) {
		int oddNumber = 1, count = 0;
		while (x > 0) {
			x -= oddNumber;
			count++;
			oddNumber += 2;
		}
		return (x >= 0) ? count : count - 1; 
	}
}