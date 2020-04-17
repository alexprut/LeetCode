class Solution {
	public int maximum69Number (int num) {
		String s = "" + num;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '6') {
				s = s.substring(0, i) + "9" + s.substring(i + 1, s.length());
				break;
			}
		}
		return Integer.valueOf(s);
	}
}