class Solution {
    public int countAsterisks(String s) {
        int counter = 0;
        boolean inBar = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') { inBar = !inBar; }
            if (s.charAt(i) == '*' && !inBar) { counter++; }
        }

        return counter;
    }
}