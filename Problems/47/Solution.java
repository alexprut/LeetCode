/**
 1,1,2

 1      2
 / \     |
 1   2    1
 |   |    |
 2   1    1

 */
class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		if (nums.length == 0) {
			return new ArrayList<>();
		}
		Arrays.sort(nums);
		ArrayList<Integer> tmp = new ArrayList<>();
		for (int num : nums) {
			tmp.add(num);
		}
		List<List<Integer>> res = new ArrayList<>();
		perm(new ArrayList<>(), tmp, res);
		return res;
	}

	private void perm(final ArrayList<Integer> c, final ArrayList<Integer> n, List<List<Integer>> res) {
		if (n.size() == 0) { res.add(c); return; }
		for (int i = 0; i < n.size(); i++) {
			if (i == 0 || n.get(i - 1) != n.get(i)) {
				ArrayList<Integer> ctmp = (ArrayList<Integer>) c.clone();
				ArrayList<Integer> ntmp = (ArrayList<Integer>) n.clone();
				ctmp.add(ntmp.get(i));
				ntmp.remove(i);
				perm(ctmp, ntmp, res);
			}
		}
	}
}