class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> used;
        for (int i = 0; i < nums.size(); i++) {
            if (used.count(target - nums[i])) {
                return {used[target - nums[i]], i};
            } else {
                used.insert({nums[i], i});
            }
        }
        return vector<int>();
    }
};