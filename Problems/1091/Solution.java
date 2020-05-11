class Solution {
	public int shortestPathBinaryMatrix(int[][] g) {
		if (g.length == 0 || (g.length != 0 && g[0][0] == 1)) { return -1; }
		g[0][0] = 1;
		int max = Integer.MAX_VALUE;
		class P { public int i, j, c; P(int ii, int jj, int cc) { i=ii; j=jj; c=cc;}}
		LinkedList<P> q = new LinkedList<>();
		q.offer(new P(0, 0, 1));
		int n = g.length - 1;
		int m = g[0].length - 1;
		while (q.size() != 0) {
			P p = q.poll();
			if (p.i == n && p.j == m) {
				max = Math.min(p.c, max);
			}
			if (p.i - 1 >= 0 && g[p.i - 1][p.j] != 1) {
				g[p.i - 1][p.j] = 1;
				q.offer(new P(p.i - 1, p.j, p.c + 1));
			}
			if (p.j - 1 >= 0 && g[p.i][p.j - 1] != 1) {
				g[p.i][p.j - 1] = 1;
				q.offer(new P(p.i, p.j - 1, p.c + 1));
			}
			if (p.i + 1 <= n && g[p.i + 1][p.j] != 1) {
				g[p.i + 1][p.j] = 1;
				q.offer(new P(p.i + 1, p.j, p.c + 1));
			}
			if (p.j + 1 <= m && g[p.i][p.j + 1] != 1) {
				g[p.i][p.j + 1] = 1;
				q.offer(new P(p.i, p.j + 1, p.c + 1));
			}

			if (p.i + 1 <= n && p.j + 1 <= m && g[p.i + 1][p.j + 1] != 1) {
				g[p.i + 1][p.j + 1] = 1;
				q.offer(new P(p.i + 1, p.j + 1, p.c + 1));
			}
			if (p.i + 1 <=n && p.j - 1 >= 0 && g[p.i + 1][p.j - 1] != 1) {
				g[p.i + 1][p.j - 1] = 1;
				q.offer(new P(p.i + 1, p.j - 1, p.c + 1));
			}
			if (p.i - 1 >=0 && p.j + 1 <= m && g[p.i - 1][p.j + 1] != 1) {
				g[p.i - 1][p.j + 1] = 1;
				q.offer(new P(p.i - 1, p.j + 1, p.c + 1));
			}
			if (p.i - 1 >=0 && p.j - 1 >=0  && g[p.i - 1][p.j - 1] != 1) {
				g[p.i - 1][p.j - 1] = 1;
				q.offer(new P(p.i - 1, p.j - 1, p.c + 1));
			}
		}
		return max == Integer.MAX_VALUE ? -1: max;
	}
}