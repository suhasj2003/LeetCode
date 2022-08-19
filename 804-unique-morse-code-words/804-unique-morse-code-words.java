class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
		ArrayList<String> morse = new ArrayList<String>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
				"...-", ".--", "-..-", "-.--", "--.."));
		HashSet<String> transformations = new HashSet<String>();
		for (String word : words) {
			StringBuilder convert = new StringBuilder();
			int i;
			for (Character c : word.toCharArray()) {
				i = c - 97;
				convert.append(morse.get(i));
			}
			transformations.add(convert.toString());
		}
		return transformations.size();
	}
}