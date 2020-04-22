class Solution {
	public int oddCells(int n, int m, int[][] indices) {
		if (n == 0 || m == 0) { return 0; }
		int counter = 0;
		int[][] adj = new int[n][m];
		for (int p = 0; p < indices.length; p++) {
			int r = indices[p][0];
			int c = indices[p][1];
			for (int i = 0; i < m; i++) {
				adj[r][i]++;
			}
			for (int i = 0; i < n; i++) {
				adj[i][c]++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (adj[i][j] % 2 != 0) { counter++; }
			}
		}
		return counter;
	}
}