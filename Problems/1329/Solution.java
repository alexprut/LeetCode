class Solution {
	public int[][] diagonalSort(int[][] m) {
		if (m.length == 0) { return m; }
		int mnl = m.length;
		int mml = m[0].length;
		for (int i = 0; i < mnl; i++) {
			int max = 0;
			for (int k = i; k < mnl && k - i < mml; k++) {
				max = k - i;
			}
			int[] tmp = new int[max + 1];
			for (int k = i; k < mnl && k - i < mml; k++) {
				tmp[k - i] = m[k][k - i];
			}
			Arrays.sort(tmp);
			for (int k = i; k < mnl && k - i < mml; k++) {
				m[k][k - i] = tmp[k - i];
			}
		}

		for (int i = 1; i < mml; i++) {
			int max = 0;
			for (int k = i; k - i < mnl && k < mml; k++) {
				max = k - i;
			}
			int[] tmp = new int[max + 1];
			for (int k = i; k - i < mnl && k < mml; k++) {
				tmp[k - i] = m[k - i][k];
			}
			Arrays.sort(tmp);
			for (int k = i; k - i < mnl && k < mml; k++) {
				m[k - i][k] = tmp[k - i];
			}
		}

		return m;
	}
}