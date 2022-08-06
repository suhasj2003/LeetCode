class Solution {
    public static int mySqrt(int x) {
		long count = 1;
		while (count * count <= x) count++;
		return (int) count - 1; 
	}
}