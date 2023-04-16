class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] chars = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            chars[allowed.charAt(i) - 'a'] = true;
        }
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            boolean consistent = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!chars[words[i].charAt(j) - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                counter++;
            }
        }

        return counter;
    }
}