class Solution {
     public static int reverse(int x) {
			
	        boolean neg = false; 
	        
	        if (x < 0) {
	            neg = true;
	            x = -x;
	        }        
	        
	        
	        
	        long num = 0;
	        while (x > 0) {
	            num = 10 * num + x % 10;
	            x /= 10;
	        }
	        
	        if (num > Integer.MAX_VALUE) {
	            return 0;
	        }
	        
	        return (int) (neg ? -num : num); 
		}
}