class Solution {
    public int commonFactors(int a, int b) {
        int counter = 0;
        int max = a > b ? a: b;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}