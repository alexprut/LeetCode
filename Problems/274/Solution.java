class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // O(nlogn)
        int max = 0;
        for (int i = 0; i < citations.length; i++) {
            int tmp = citations[i] < (citations.length - i) ? citations[i] : (citations.length - i);
            max = max < tmp ? tmp : max;
        }
        return max;
    }
}