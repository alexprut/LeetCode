class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder w = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!w.isEmpty()) {
                    if (res.isEmpty()) {
                        res = res.insert(0, w.toString());
                    } else {
                        w.append(' ');
                        res = res.insert(0, w.toString());
                    }
                    w = new StringBuilder();
                }
            } else {
                w.append(s.charAt(i));
            }
        }

        if (!w.isEmpty()) {
            if (!res.isEmpty()) {
                w.append(' ');
            }
            res = res.insert(0, w.toString());
        }

        return res.toString();
    }
}