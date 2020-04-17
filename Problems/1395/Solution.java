class Solution {
	// DP
	public int numTeams(int[] rating) {
		int counter = 0;
		int left = 0;
		int right = 0;
		for (int i = 0; i < rating.length; i++) {
			left = 0; right = 0;
			for (int l = 0; l < i; l++) {
				if (rating[l] < rating[i]) {
					left++;
				}
			}
			for (int r = rating.length - 1; r > i; r--) {
				if (rating[r] > rating[i]) {
					right++;
				}
			}
			counter += left * right;
		}
		for (int i = 0; i < rating.length; i++) {
			left = 0; right = 0;
			for (int l = 0; l < i; l++) {
				if (rating[l] > rating[i]) {
					left++;
				}
			}
			for (int r = rating.length - 1; r > i; r--) {
				if (rating[r] < rating[i]) {
					right++;
				}
			}
			counter += left * right;
		}
		return counter;
	}
}