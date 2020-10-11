class Solution {
	public void reverseString(char[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			char left = s[i];
			char right = s[s.length - i - 1];
			s[i] = right;
			s[s.length - i - 1] = left;
		}
	}
}