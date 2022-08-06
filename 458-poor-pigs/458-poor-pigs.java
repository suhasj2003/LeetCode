class Solution {
   public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		int numberOfTests = minutesToTest/minutesToDie;
		int numberOfPigs = (int) (Math.log(buckets)/Math.log(numberOfTests + 1));
		return (Math.pow(numberOfTests + 1, numberOfPigs) == buckets ? numberOfPigs : numberOfPigs + 1);
	}
}