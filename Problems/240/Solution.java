class Solution {
	public boolean searchMatrix(int[][] m, int t) {
		if (m.length == 0) { return false; }
		int r = 0;
		int c = m[0].length - 1;
		while (r < m.length && c >= 0) {
			if (m[r][c] == t) { return true; }
			if (t < m[r][c]) { c--; }
			else { r++; }
		}
		return false;
	}
}