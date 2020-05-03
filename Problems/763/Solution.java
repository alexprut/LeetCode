/**
 s = "abaaee" -> "abaa" + "ee" -> 4, 2
 l[3,1,6]

 */
class Solution {
	public List<Integer> partitionLabels(String s) {
		int[] li = new int[26];
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) { li[s.charAt(i) - 'a'] = i; }
		int i = 0;
		int start = i;
		while (i < s.length()) {
			start = i;
			int h = i;
			while (i <= h) {
				h = Math.max(li[s.charAt(i) - 'a'], h);
				i++;
			}
			res.add(i - start);
		}
		return res;
	}
}