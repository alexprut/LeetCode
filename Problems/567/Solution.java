class Solution {
	public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) { return false; }
		int[] a = new int[26];
		for (int i = 0; i < s1.length(); i++) { a[s1.charAt(i) - 'a']++; }
		for (int i = 0; i < s1.length(); i++) {
			a[s2.charAt(i) - 'a']--;
		}
		int i = 0;
		int j = s1.length() - 1;
		while (j < s2.length()) {
			if (isContained(a)) { return true; }
			i++; j++;
			if (j < s2.length()) {
				a[s2.charAt(i - 1) - 'a']++;
				a[s2.charAt(j) - 'a']--;
			}
		}
		return false;
	}

	public boolean isContained(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) { return false; }
		}
		return true;
	}
}