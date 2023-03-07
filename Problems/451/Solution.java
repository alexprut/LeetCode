/**
 Time complexity: O(nlogn)
 Space complexity: O(n)
 */
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        TreeMap<Integer, HashSet<Character>> tmp = new TreeMap<>();
        map.forEach((key, value) -> {
            if (tmp.containsKey(value)) {
                tmp.get(value).add(key);
            } else {
                HashSet<Character> set = new HashSet<>();
                set.add(key);
                tmp.put(value, set);
            }
        });
        StringBuilder str = new StringBuilder();
        while (tmp.size() != 0) {
            Map.Entry<Integer, HashSet<Character>> e = tmp.pollLastEntry();
            Iterator<Character> it = e.getValue().iterator();
            while (it.hasNext()) {
                Character c = it.next();
                for (int i = 0; i < e.getKey(); i++) {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}