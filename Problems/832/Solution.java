class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			// flip
			for (int j = 0; j < A[i].length / 2; j++) {
				int tmp = A[i][j];
				A[i][j] = A[i][A[i].length - 1 - j];
				A[i][A[i].length - 1 - j] = tmp;
			}
			// inverse
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = A[i][j] == 0 ? 1 : 0;
			}
		}
		return A;
	}
}