class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m];
        for (int i = 0; i < m; i++) { tmp[i] = nums1[i]; }
        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (tmp[i] < nums2[j]) {
                    nums1[i + j] = tmp[i];
                    i++;
                } else {
                    nums1[i + j] = nums2[j];
                    j++;
                }
            } else {
                if (i < m) {
                    nums1[i + j] = tmp[i];
                    i++;
                } else {
                    nums1[i + j] = nums2[j];
                    j++;
                }
            }
        }
    }
}