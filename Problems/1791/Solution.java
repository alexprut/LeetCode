/**
 Edge cases:
 What if the graph does not have a star node? (i.e. connected to n-1 edges)

 Time complexity: O(|E|)

 Space complexity: O(|V|)
 */
class Solution {
    public int findCenter(int[][] edges) {
        int c = 0;
        int starEdge = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            if (map.containsKey(edges[i][0])) {
                map.put(edges[i][0], map.get(edges[i][0])  + 1);
            } else {
                map.put(edges[i][0], 1);
            }
            if (map.containsKey(edges[i][1])) {
                map.put(edges[i][1], map.get(edges[i][1]) + 1);
            } else {
                map.put(edges[i][1], 1);
            }
            if (map.get(edges[i][0]) > c) {
                c = map.get(edges[i][0]);
                starEdge = edges[i][0];
            }
            if (map.get(edges[i][1]) > c) {
                c = map.get(edges[i][1]);
                starEdge = edges[i][1];
            }
        }
        return starEdge;
    }
}