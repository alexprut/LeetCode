class Solution {
	public void setZeroes(int[][] m) {
		if (m.length == 0) { return; }
		boolean c = false;
		boolean r = false;
		int rl = m.length;
		int cl = m[0].length;
		for (int i = 0; i < rl; i++) {
			for (int j = 0; j < cl; j++) {
				if (m[i][j] == 0) {
					if (i == 0) { c = true; }
					if (j == 0) { r = true; }
					m[0][j] = 0;
					m[i][0] = 0;
				}
			}
		}
		for (int i = 1; i < rl; i++) {
			for (int j = 1; j < cl; j++) {
				if (m[0][j] == 0 || m[i][0] == 0) {
					m[i][j] = 0;
				}
			}
		}
		if (c) {
			for (int i = 0; i < cl; i++) {
				m[0][i] = 0;
			}
		}
		if (r) {
			for (int i = 0; i < rl; i++) {
				m[i][0] = 0;
			}
		}
	}
}