class Solution {
	public String generateTheString(int n) {
		String r = "";
		if (n % 2 == 0) {
			for (int i = 0; i < n - 1; i++) {
				r += "x";
			}
			r += "y";
		} else {
			for (int i = 0; i < n; i++) {
				r += "x";
			}
		}

		return r;
	}
}