class Solution {
	public List<String> letterCasePermutation(String S) {
		LinkedList<String> q = new LinkedList<>();
		q.add(S);
		int i = 0;
		while (i < S.length()) {
			int l = q.size();
			while (l > 0) {
				String c = q.poll();
				if (!Character.isDigit(c.charAt(i))) {
					StringBuilder b = new StringBuilder(c);
					b.setCharAt(i, Character.toLowerCase(c.charAt(i)));
					q.offer(b.toString());
					b.setCharAt(i, Character.toUpperCase(c.charAt(i)));
					q.offer(b.toString());
				} else {
					q.offer(c);
				}
				l--;
			}
			i++;
		}
		return q;
	}
}