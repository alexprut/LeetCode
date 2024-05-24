class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        int[] ans = new int[k];
        for (int i = 0; i < logs.length; i++) {
            if (map.containsKey(logs[i][0])) {
                map.get(logs[i][0]).add(logs[i][1]);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(logs[i][1]);
                map.put(logs[i][0], set);
            }
        }
        Object[] values = map.values().toArray();
        for (int i = 0; i < values.length; i++) {
            Set<Integer> set = (Set<Integer>) values[i];
            ans[set.size() - 1]++;
        }

        return ans;
    }
}