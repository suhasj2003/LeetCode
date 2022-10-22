/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool findTarget(TreeNode* root, int k) {
        queue<TreeNode*> visited;
        visited.push(root);
        set<int> nums;
        while(!visited.empty()) {
            TreeNode* curr = visited.front();
            visited.pop();
            if (curr == NULL) {
                continue;
            }
            if (nums.count(k - curr->val)) {
                return true;
            }
            nums.insert(curr->val);
            visited.push(curr->left);
            visited.push(curr->right);
        }
        return false;
    }
};