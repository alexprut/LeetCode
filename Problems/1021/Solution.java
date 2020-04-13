class Solution {
	public String removeOuterParentheses(String S) {
		if (S.length() == 0) {
			return "";
		}
		ArrayList<String> chunk = new ArrayList<>();
		int open = 1;
		int start = 0;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == ')') {
				open--;
				if (open == 0) {
					chunk.add(S.substring(start, i + 1));
					start = i + 1;
				}
			} else {
				open++;
			}
		}
		String res = "";
		for (int i = 0; i < chunk.size(); i++) {
			if (chunk.get(i).length() != 2) {
				res += chunk.get(i).substring(1, chunk.get(i).length() - 1);
			}
		}
		return res;
	}
}