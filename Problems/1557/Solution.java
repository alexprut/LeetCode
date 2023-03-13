/**
 map: 3 -> {1,4}
 map: 2 -> {}
 map: 0 -> {}

 map: 3 -> {2,5,4}
 map: 0 -> {1}


 [[0,1],[0,2],[2,5],[3,4],[4,2]]

 0 ---> 1
 |
 .
 2 <----4 <--- 3
 |
 .
 5

 0 -> {1,2,5}
 3 -> {4}

 Time complexity: O(|V|+|E|)
 DFS
 */
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) { adj.add(new ArrayList<>()); }
        for (int i = 0; i < edges.size(); i++) {
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (visited[i]) { continue; }
            // BSF
            Stack<Integer> s = new Stack();
            s.push(i);
            visited[i] = true;
            map.put(i, new HashSet<>());
            while (s.size() != 0) {
                int current = s.pop();
                for (int j = 0; j < adj.get(current).size(); j++) {
                    int next = adj.get(current).get(j);
                    if (!visited[next]) {
                        visited[next] = true;
                        s.push(next);
                        map.get(i).add(next);
                    } else {
                        if (map.containsKey(next)) {
                            map.get(i).addAll(map.get(next));
                            map.get(i).add(next);
                            map.remove(next);
                        }
                    }
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>(map.keySet());
        return res;
    }
}