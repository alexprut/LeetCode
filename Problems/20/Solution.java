class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) { return false; }
                if (
                        (stack.peek() != '(' && c == ')') ||
                                (stack.peek() != '[' && c == ']') ||
                                (stack.peek() != '{' && c == '}')
                ) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.empty();
    }
}