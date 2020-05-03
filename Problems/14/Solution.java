class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) { return ""; }
		String res = "";
		String r = strs[0];
		for (int i = 0; i < r.length(); i++) {
			for (int k = 0; k < strs.length; k++) {
				if (strs[k].length() <= i || strs[k].charAt(i) != r.charAt(i)) {
					return res;
				}
			}
			res += r.charAt(i);
		}

		return res;
	}
}