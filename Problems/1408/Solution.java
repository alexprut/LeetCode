class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> r = new ArrayList<>();
        Arrays.sort(words, new Comparator<>() {
            public int compare(String a, String b) {
                return a.length() < b.length() ? -1 : 1;
            }
        });
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    r.add(words[i]);
                    break;
                }
            }
        }
        return r;
    }
}