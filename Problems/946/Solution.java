class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) { return false; }

        Stack<Integer> s = new Stack<>();
        int pi = 0;
        int pj = 0;
        while (pi < pushed.length) {
            // Populate
            if (s.empty() || (pushed[pi] != popped[pj] && s.peek() != popped[pj])) {
                s.push(pushed[pi]);
                pi++;
            }
            // Extract
            if (pi < pushed.length && pushed[pi] == popped[pj]) {
                s.push(pushed[pi]);
                pi++;
            }
            if (s.peek() == popped[pj]) {
                s.pop();
                pj++;
            }
        }

        while (!s.empty()) {
            if (s.peek() != popped[pj]) { return false; }
            s.pop();
            pj++;
        }

        return true;
    }
}