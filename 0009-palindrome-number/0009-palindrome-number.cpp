class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int norm = x; 
        long rev = 0;
        while (norm > 0) {
            if (rev * 10 > INT_MAX) return false;
            rev *= 10;
            rev += (norm % 10);
            norm /= 10;
        }
        return x == rev;
    } 
};