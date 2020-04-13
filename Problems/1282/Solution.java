class Solution {
	public List<List<Integer>> groupThePeople(int[] g) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < g.length; i++) {
			if (map.containsKey(g[i])) {
				map.get(g[i]).add(i);
			} else {
				List<Integer> list = new LinkedList<Integer>();
				list.add(i);
				map.put(g[i], list);
			}
			if (map.get(g[i]).size() == g[i]) {
				res.add(map.get(g[i]));
				map.remove(g[i]);
			}
		}
		return res;
	}
}