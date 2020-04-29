class Solution {
	public int minSteps(String s, String t) {
		int[] sa = new int[26];
		int[] ta = new int[26];
		for (int i = 0; i < s.length(); i++) {
			sa[s.charAt(i) - 97]++;
			ta[t.charAt(i) - 97]++;
		}
		int c = 0;
		for (int i = 0; i < 26; i++) {
			c += Math.abs(sa[i] - ta[i]);
		}
		return c / 2;
	}
}