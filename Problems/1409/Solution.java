class Solution {
	public int[] processQueries(int[] q, int m) {
		int[] r = new int[q.length];
		LinkedList<Integer> l = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			l.add(i + 1);
		}
		for (int i = 0; i < q.length; i++) {
			r[i] = l.indexOf(q[i]);
			l.remove(r[i]);
			l.addFirst(q[i]);
		}
		return r;
	}
}