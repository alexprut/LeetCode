class Solution {
    public int maxArea(int[] h) {
        int i = 0;
        int j = h.length - 1;
        int max = -1;
        while (i < j) {
            max = Math.max(max, Math.min(h[i], h[j]) * (j - i));
            if (i == j - 1) { break; }
            if (h[i] > h[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}