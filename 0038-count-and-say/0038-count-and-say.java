class Solution {
    public String countAndSay(int n) {
        return cASAux(n - 1, "1");
    }
    public String cASAux(int n, String s) {
        if (n == 0) {
            return s;
        }
        char curr = s.charAt(0);
        int count = 0;
        StringBuilder temp = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (curr != c) {
                temp.append(count);
                temp.append(curr);
                curr = c;
                count = 1;
            } else {
                count++;
            }
        }
        temp.append(count);
        temp.append(curr);
        return cASAux(n - 1, temp.toString());
    }
}