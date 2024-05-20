/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer, Node> clones = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public Node cloneGraph(Node node) {
        if (node == null) { return node; }
        Node clone = new Node(node.val);
        visited.add(node.val);
        clones.put(clone.val, clone);
        for (int i = 0; i < node.neighbors.size(); i++) {
            if (visited.contains(node.neighbors.get(i).val)) {
                clone.neighbors.add(clones.get(node.neighbors.get(i).val));
            } else {
                clone.neighbors.add(cloneGraph(node.neighbors.get(i)));
            }
        }

        return clone;
    }
}