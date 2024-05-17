class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();

        for (int i = 1;  i - n <= k - 1; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(i);
            stack.push(tmp);
        }

        while (!stack.empty()) {
            List<Integer> c = stack.pop();
            if (c.size() == k) {
                res.add(c);
                continue;
            }
            if (c.size() < k && c.get(c.size() - 1) - n < k - c.size()) {
                for (int i = c.get(c.size() - 1) + 1; i - n < k - c.size(); i++) {
                    List<Integer> tmp = new ArrayList<>(c);
                    tmp.add(i);
                    stack.push(tmp);
                }
            }
        }

        return res;
    }
}