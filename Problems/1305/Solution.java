/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> f = new ArrayList<>();
		List<Integer> s = new ArrayList<>();
		v(root1, f);
		v(root2, s);
		List<Integer> a = new ArrayList<>();
		int i = 0; int j = 0;
		while (i < f.size() || j < s.size()) {
			if (i < f.size() && j < s.size()) {
				if (f.get(i) < s.get(j)) {
					a.add(f.get(i));
					i++;
				} else {
					a.add(s.get(j));
					j++;
				}
			} else if (i < f.size()) {
				a.add(f.get(i));
				i++;
			} else {
				a.add(s.get(j));
				j++;
			}
		}
		return a;
	}

	public void v(TreeNode n, List<Integer> a) {
		if (n == null) { return; }
		v(n.left, a);
		a.add(n.val);
		v(n.right, a);
	}
}