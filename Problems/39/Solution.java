class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        Arrays.sort(candidates);
        backtrack(new ArrayList<Integer>(), 0, 0);
        return res;
    }

    private void backtrack(ArrayList<Integer> combination, int i, int currentSum) {
        if (currentSum == target) { res.add((ArrayList)combination.clone()); }
        else {
            for (int j = i; j < candidates.length && currentSum + candidates[j] <= target; j++) {
                combination.add(candidates[j]);
                backtrack(combination, j, currentSum + candidates[j]);
                combination.remove(combination.size() - 1);
            }
        }
    }
}