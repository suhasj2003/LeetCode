class Solution {
   public static String[] findWords(String[] words) {
		HashSet<Character> q = new HashSet<Character>(Arrays.asList('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'));
		HashSet<Character> a = new HashSet<Character>(Arrays.asList('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'));
		HashSet<Character> z = new HashSet<Character>(Arrays.asList('z','x','c','v','b','n','m','Z','X','C','V','B','N','M'));
		List<String> result = new LinkedList<String>();
		for (String s : words) {
			boolean letters = true;
			HashSet<Character> curr;
			if (q.contains(s.charAt(0))) {
				curr = q;
			} else if (a.contains(s.charAt(0))) {
				curr = a;
			} else {
				curr = z;
			}
			for (Character c : s.toCharArray()) {
				if (!curr.contains(c)) {
					letters = false;
				}
			}
			if (letters) result.add(s);
		}
		String[] ans = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			ans[i] = result.get(i);
		}
		return ans;
	}
}