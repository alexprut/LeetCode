class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] h = new int[27];
            for (int k = 0; k < strs[i].length(); k++) {
                h[strs[i].charAt(k) - 'a'] += 1;
            }
            String hash = "";
            for (int k = 0; k < h.length; k++) {
                char t = 'a';
                t += k;
                hash = hash + "" + h[k] + "" + t;
            }
            if (map.containsKey(hash)) {
                map.get(hash).add(strs[i]);
            } else {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(hash, l);
            }
        }

        Object[] v = map.values().toArray();
        for (int i = 0; i < v.length; i++) {
            res.add((List<String>) v[i]);
        }

        return res;
    }
}