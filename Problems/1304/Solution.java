class Solution {
	public int[] sumZero(int n) {
		int[] numb = new int[n];
		int counter = (n % 2 == 0) ? n: n - 1;
		for (int i = 0 ;i < counter; i = i + 2) {
			numb[i] = i + 1;
			numb[i + 1] = - i - 1;
		}
		if (n % 2 != 0) {
			numb[n - 1] = 0;
		}
		return numb;
	}
}