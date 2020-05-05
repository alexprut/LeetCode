class Solution {
	public int[][] transpose(int[][] A) {
		int[][] r = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				r[j][i] = A[i][j];
			}
		}
		return r;
	}
}