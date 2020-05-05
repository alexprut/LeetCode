class Solution {
	public List<Integer> luckyNumbers (int[][] m) {
		int[] minR = new int[m.length];
		int[] maxC = new int[m[0].length];
		for (int i = 0; i < m.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < m[0].length; j++) {
				min = Math.min(min, m[i][j]);
			}
			minR[i] = min;
		}
		for (int j = 0; j < m[0].length; j++) {
			int max = 0;
			for (int i = 0; i < m.length; i++) {
				max = Math.max(max, m[i][j]);
			}
			maxC[j] = max;
		}

		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] == minR[i] && m[i][j] == maxC[j]) {
					res.add(m[i][j]);
				}
			}
		}

		return res;
	}
}