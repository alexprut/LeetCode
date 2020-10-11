class Solution {
	public List<List<Integer>> permute(int[] elements) {
		List<Integer> tmp = new ArrayList<>();
		for (int i = 0; i < elements.length; i++) {
			tmp.add(new Integer(elements[i]));
		}
		return permute(tmp);
	}

	public static <T> List<List<T>> permute(List<T> elements) {
		if (elements.isEmpty()) {
			List<List<T>> tmp = new ArrayList<>();
			tmp.add(new ArrayList<>());
			return tmp;
		}

		if (elements.size() == 1) {
			List<List<T>> tmp = new ArrayList<>();
			tmp.add(elements);
			return tmp;
		}

		List<List<T>> perm = new ArrayList<>();
		for (int i = 0; i < elements.size(); i++) {
			T current = elements.get(i);
			List<T> remaining = new ArrayList<>(elements);
			remaining.remove(i);
			List<List<T>> recursive = permute(remaining);
			for (List<T> elem : recursive) {
				elem.add(0, current);
			}
			perm.addAll(recursive);
		}

		return perm;
	}
}