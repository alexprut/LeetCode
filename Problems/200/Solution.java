class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;
        int n = grid.length;
        int m = grid[0].length;
        Stack<ArrayList<Integer>> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    stack.push(p(i,j));
                    while (!stack.empty()) {
                        ArrayList<Integer> p = stack.pop();
                        grid[p.get(0)][p.get(1)] = '0';
                        // top
                        if (p.get(0) - 1 >= 0 && grid[p.get(0) - 1][p.get(1)] == '1') {
                            stack.push(p(p.get(0) - 1, p.get(1)));
                        }
                        // right
                        if (p.get(1) + 1 < m && grid[p.get(0)][p.get(1)+1] == '1') {
                            stack.push(p(p.get(0), p.get(1)+1));
                        }
                        // bottom
                        if (p.get(0) + 1 < n && grid[p.get(0) + 1][p.get(1)] == '1') {
                            stack.push(p(p.get(0) + 1, p.get(1)));
                        }
                        // left
                        if (p.get(1) - 1 >= 0 && grid[p.get(0)][p.get(1) - 1] == '1') {
                            stack.push(p(p.get(0), p.get(1) - 1));
                        }
                    }
                }
            }
        }

        return counter;
    }

    public ArrayList<Integer> p(int x, int y) {
        ArrayList<Integer> r = new ArrayList<>();
        r.add(x);
        r.add(y);
        return r;
    }
}