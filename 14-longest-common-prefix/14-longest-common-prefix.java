class Solution {
  public static String longestCommonPrefix(String[] strs) {

		String prefix = strs[0];
		String temp = "";

		for (int i = 0; i < strs.length - 1; i++) {

			if (strs[i].length() < strs[i + 1].length()) {
				for (int j = 0; j < strs[i].length(); j++) {

					if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
						temp += strs[i].substring(j, j + 1);
					} else {
						break;
					}

				}
			} else {
				for (int j = 0; j < strs[i + 1].length(); j++) {

					if (strs[i + 1].charAt(j) == strs[i].charAt(j)) {
						temp += strs[i + 1].substring(j, j + 1);
					} else {
						break;
					}

				}

			}
			
			if (prefix.contains(temp)) {
				prefix = temp;
				temp = "";
			} else if (temp.contains(prefix)) {
				temp = "";
			} else {
				prefix = "";
				break;
			}
		}
		
		return prefix;
	}
}