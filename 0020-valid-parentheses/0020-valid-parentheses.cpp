class Solution {
public:
    bool isValid(string s) {
        if (s.length() == 1) return false;
        stack<int> p; 
        for (int i = 0; i < s.length(); i++) {
            char c = s[i]; 
            if (c == '(' || c == '[' || c == '{') {
                p.push(c);
            } else if (c == ')') {
                if (!p.empty() && p.top() == '(') {
                    p.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!p.empty() && p.top() == '[') {
                    p.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!p.empty() && p.top() == '{') {
                    p.pop();
                } else {
                    return false;
                }
            }
        }
        return p.empty() ? true : false;
    }
};