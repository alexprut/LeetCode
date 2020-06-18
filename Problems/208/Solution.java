class Trie {
	private final Node root = new Node();

	/** Initialize your data structure here. */
	public Trie() {
	}

	/** Inserts a word into the trie. */
	public void insert(String elem) {
		if (!elem.isEmpty()) {
			Node tmp = root;
			for (int i = 0; i < elem.length(); i++) {
				tmp.size++;
				if (!tmp.children.containsKey(elem.charAt(i))) {
					tmp.children.put(elem.charAt(i), new Node());
				}
				tmp = tmp.children.get(elem.charAt(i));
			}
			tmp.size++;
			tmp.isEndOfWord = true;
		}
	}

	/** Returns if the word is in the trie. */
	public boolean search(String elem) {
		Node node = contains(elem);
		return node != null && node.isEndOfWord;
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		return contains(prefix) != null;
	}

	protected Node contains(String elem) {
		if (!elem.isEmpty()) {
			Node tmp = root;
			for (int i = 0; i < elem.length(); i++) {
				if (!tmp.children.containsKey(elem.charAt(i))) {
					return null;
				}
				tmp = tmp.children.get(elem.charAt(i));
			}
			return tmp;
		}

		return null;
	}

	protected static class Node {
		boolean isEndOfWord = false;
		int size = 0;
		final HashMap<Character, Node> children = new HashMap<>();
	}
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */