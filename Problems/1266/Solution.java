class Solution {
	public int minTimeToVisitAllPoints(int[][] points) {
		int counter = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int deltaX = Math.abs(points[i+1][0] - points[i][0]);
			int deltaY = Math.abs(points[i+1][1] - points[i][1]);
			counter += Math.min(deltaX, deltaY) + Math.abs(deltaX - deltaY);
		}
		return counter;
	}
}