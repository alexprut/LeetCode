/**
 rowSum = [3,8], colSum = [4,7]

 1 2 3
 3 5 8
 4 7

 rowSum = [5,7,10], colSum = [8,6,8]

 1 1 3 5
 2 2 3 7
 5 3 2 10
 8 6 8

 */
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numRows = rowSum.length;
        int numCols = colSum.length;
        int[][] matrix = new int[numRows][numCols];

        // Iterate over rows and columns to distribute sums
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                // Take the minimum of remaining rowSum[i] and colSum[j] to fill the cell
                matrix[i][j] = Math.min(rowSum[i], colSum[j]);
                // Update remaining sums after filling the cell
                rowSum[i] -= matrix[i][j];
                colSum[j] -= matrix[i][j];
            }
        }
        return matrix;
    }
}