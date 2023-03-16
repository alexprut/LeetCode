class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] tmp = new int[1001];
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < items1.length; i++) { tmp[items1[i][0]] += items1[i][1]; }
        for (int i = 0; i < items2.length; i++) { tmp[items2[i][0]] += items2[i][1]; }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 0) { continue; }
            res.add(new ArrayList<>(Arrays.asList(i, tmp[i])));
        }
        return res;
    }
}