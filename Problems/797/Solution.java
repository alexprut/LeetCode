class Solution {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<Integer> visited = new ArrayList<>();
		for (int i = 0; i < graph.length; i++) { visited.add(0); }
		return dfs(
				0,
				graph,
				new ArrayList<Integer>(),
				visited
		);
	}

	public List<List<Integer>> dfs(int c, int[][] graph, List<Integer> acc, List<Integer> visited) {
		List<List<Integer>> res = new ArrayList<>();
		if (visited.get(c) == 0) {
			visited.set(c, 1);
			acc.add(c);
			if (c == graph.length - 1) {
				res.add(acc);
				return res;
			}
			for (int i = 0; i < graph[c].length; i++) {
				if (visited.get(graph[c][i]) == 0) {
					res.addAll(dfs(
							graph[c][i],
							graph,
							new ArrayList<Integer>(acc),
							new ArrayList<Integer>(visited)
					));
				}
			}
		}

		return res;
	}
}