class Solution {
    HashSet<String> set = new HashSet<>();
    Set<String> memo = new HashSet<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        for (int i = 0; i < wordDict.size(); i++) {
            set.add(wordDict.get(i));
        }

        return dfs(s);
    }

    public boolean dfs(String s) {
        if (s.length() == 0) { return true; }
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.substring(0,i + 1))) {
                if (!memo.contains(s.substring(i + 1, s.length()))) {
                    boolean res = dfs(s.substring(i + 1, s.length()));
                    if (res) {
                        return true;
                    }
                    memo.add(s.substring(i + 1, s.length()));
                }
            }
        }

        return false;
    }
}