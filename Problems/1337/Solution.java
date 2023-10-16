class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        class Pair implements Comparable<Pair> {
            int val;
            int index;
            Pair(int v, int i) {
                val = v;
                index = i;
            }

            @Override
            public int compareTo(Pair b) {
                if (this.val == b.val) {
                    return this.index < b.index ? -1 : 1;
                }
                return this.val < b.val ? -1 : 1;
            }
        }
        PriorityQueue<Pair> q = new PriorityQueue();
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    c++;
                } else {
                    break;
                }
            }
            q.add(new Pair(c, i));
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll().index;
        }
        return res;
    }
}