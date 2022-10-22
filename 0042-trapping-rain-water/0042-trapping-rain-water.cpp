class Solution {
public:
    int trap(vector<int>& height) {
        int i = 0, j = height.size() - 1;
        int start = 0, end = 0;
        int sum = 0;
        while (i < j) {
            start = start < height[i] ? height[i] : start;
            end = end < height[j] ? height[j] : end;
            if (start < end) {
                sum += (start - height[i]);
                i++;
            } else {
                sum += (end - height[j]);
                j--;  
            }
        }
        return sum;
    }
};