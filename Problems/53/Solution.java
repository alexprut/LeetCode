/*
Recursive
e.g.
[5,4,-1,7,8]
add 5
add 4
don't add 4
don't add 5
add 4
don't add 4

        => 2^n (pretty bad)

DP => at step i, include the next element or start creating sum at i
n*n space matrix
n^2 time

Kadane algorithm
 */
class Solution {
    public int maxSubArray(int[] elements) {
        if (elements.length == 0) {
            return 0;
        }

        int maxEndingHere = elements[0];
        int maxSoFar = elements[0];

        for (int i = 1; i < elements.length; i++) {
            maxEndingHere = Math.max(elements[i], maxEndingHere + elements[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}