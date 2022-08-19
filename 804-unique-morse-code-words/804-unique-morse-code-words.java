class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
		ArrayList<String> morse = new ArrayList<String>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
				"...-", ".--", "-..-", "-.--", "--.."));
		HashSet<String> transformations = new HashSet<String>();
		for (String word : words) {
			StringBuilder convert = new StringBuilder();
			for (Character c : word.toCharArray()) {
				convert.append(morse.get(c - 97));
			}
			transformations.add(convert.toString());
		}
		return transformations.size();
	}
}