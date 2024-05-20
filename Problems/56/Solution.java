class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0) {
                ArrayList<Integer> entry = new ArrayList<>();
                entry.add(intervals[i][0]);
                entry.add(intervals[i][1]);
                res.add(entry);
            } else {
                if (intervals[i][0] <= res.get(res.size() - 1).get(1)) {
                    res.get(res.size() - 1).set(1, Math.max(res.get(res.size() - 1).get(1), intervals[i][1]));
                } else {
                    ArrayList<Integer> entry = new ArrayList<>();
                    entry.add(intervals[i][0]);
                    entry.add(intervals[i][1]);
                    res.add(entry);
                }
            }
        }

        int[][] ret = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ret[i][0] = res.get(i).get(0);
            ret[i][1] = res.get(i).get(1);
        }
        return ret;
    }
}