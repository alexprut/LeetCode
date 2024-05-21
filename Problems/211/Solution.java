class WordDictionary {
    Trie trie;

    public WordDictionary() {
        trie = new Trie();
    }

    public void addWord(String word) {
        trie.insert(word);
    }

    public boolean search(String word) {
        return trie.search(word);
    }

    public class Trie {

        private final Node root = new Node();

        public Trie() {}

        public void insert(String elem) {
            if (!elem.isEmpty()) {
                Node tmp = root;
                for (int i = 0; i < elem.length(); i++) {
                    if (!tmp.children.containsKey(elem.charAt(i))) {
                        tmp.children.put(elem.charAt(i), new Node());
                    }
                    tmp = tmp.children.get(elem.charAt(i));
                }
                tmp.isEndOfWord = true;
            }
        }

        public boolean search(String elem) {
            return search(root, elem);
        }

        protected boolean search(Node root, String elem) {
            if (root != null && root.isEndOfWord && elem.length() == 0) { return true; }
            if (elem.length() == 0 && !root.isEndOfWord) {
                return false;
            }
            char c = elem.charAt(0);
            if (c == '.') {
                Object[] values = root.children.values().toArray();
                for (int i = 0; i < values.length; i++) {
                    if (search((Node) values[i], elem.substring(1, elem.length()))) {
                        return true;
                    }
                }
            } else {
                if (root.children.containsKey(c)) {
                    return search(root.children.get(c), elem.substring(1, elem.length()));
                } else {
                    return false;
                }
            }

            return false;
        }



        protected static class Node {
            boolean isEndOfWord = false;
            final HashMap<Character, Node> children = new HashMap<>();
        }
    }
}