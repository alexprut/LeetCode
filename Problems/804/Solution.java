class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		HashSet<String> set = new HashSet<>();
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			String tmp = t(words[i]);
			if (!set.contains(tmp)) {
				counter++;
				set.add(tmp);
			}
		}
		return counter;
	}

	public String t(String w) {
		String[] aphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < w.length(); i++) {
			b.append(aphabet[w.charAt(i) - 97]);
		}
		return b.toString();
	}
}