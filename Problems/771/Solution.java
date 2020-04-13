class Solution {
	public int numJewelsInStones(String J, String S) {
		TreeSet<Character> set = new TreeSet<Character>();
		for (int i = 0; i < J.length(); i++) {
			set.add(J.charAt(i));
		}
		int counter = 0;
		for (int i = 0; i < S.length(); i++) {
			if (set.contains(S.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}
}