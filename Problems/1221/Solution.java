class Solution {
	public int balancedStringSplit(String s) {
		int counterR = 0;
		int counterL = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				counterR++;
			} else {
				counterL++;
			}
			if (counterR == counterL && counterR > 0) {
				if (i + 1 < s.length()) {
					return 1 + balancedStringSplit(s.substring(i + 1, s.length()));
				}
				return 1;
			}
		}
		if (counterR == counterL && counterR > 0) {
			if (counterL + counterR + 1 < s.length()) {
				return 1 + balancedStringSplit(s.substring(counterL + counterR + 1, s.length()));
			}
			return 1;
		}
		return 0;
	}
}