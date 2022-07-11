class Solution {
    public boolean isPalindrome(int x) {
        
        String str  = String.valueOf(x);
        String temp = ""; 
        
        for(int i = str.length(); i > 0; i--) {
            temp += str.substring(i-1, i);
        }
        
        if (str.equals(temp)) {
            return true;
        } else {
            return false;
        }   
        
    }
}