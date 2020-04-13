class Solution {
	public int subtractProductAndSum(int n) {
		int prod = 1;
		int sum = 0;
		String tmp = String.valueOf(n);
		for (int i = 0; i < tmp.length(); i++) {
			int current = Integer.parseInt("" + tmp.charAt(i));
			prod *= current;
			sum += current;
		}
		return prod - sum;
	}
}