/**
 Time Complexity: O(m*n)
 Space Complexity: O(m*n)
 */
class Solution {
    public int n;
    public int m;

    public void solve(char[][] board) {
        n = board.length;
        m = board[0].length;
        int[][] visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0) {
                    if (board[i][j] == 'X') {
                        visited[i][j] = 1;
                    } else {
                        boolean isInside = visitIsInside(new Pair(i,j), board, visited);
                        if (isInside) {
                            visitChangeColor(new Pair(i,j), board, visited);
                        }
                    }
                }
            }
        }
    }

    public void visitChangeColor(Pair start, char[][] board, int[][] visited) {
        Stack<Pair> stack = new Stack<>();
        stack.push(start);
        while (!stack.empty()) {
            Pair c = stack.pop();
            visited[c.x][c.y] = 1;
            board[c.x][c.y] = 'X';
            ArrayList<Pair> next = nextPairs(c);
            for (int i = 0; i < next.size(); i++) {
                Pair nexti = next.get(i);
                if (visited[nexti.x][nexti.y] == 2) {
                    stack.push(nexti);
                }
            }
        }
    }

    public boolean visitIsInside(Pair start, char[][] board, int[][] visited) {
        boolean isInside = true;
        Stack<Pair> stack = new Stack<>();
        stack.push(start);
        while (!stack.empty()) {
            Pair c = stack.pop();
            visited[c.x][c.y] = 2;
            if (isBorder(c)) {
                isInside = false;
            }
            ArrayList<Pair> next = nextPairs(c);
            for (int i = 0; i < next.size(); i++) {
                Pair nexti = next.get(i);
                if (visited[nexti.x][nexti.y] == 0 && board[nexti.x][nexti.y] == 'O') {
                    stack.push(nexti);
                }
            }
        }

        return isInside;
    }

    public ArrayList<Pair> nextPairs(Pair p) {
        ArrayList<Pair> next = new ArrayList<>();
        if (p.x - 1 >= 0) {
            next.add(new Pair(p.x-1, p.y));
        }

        if (p.y + 1 < m) {
            next.add(new Pair(p.x, p.y+1));
        }

        if (p.x + 1 < n) {
            next.add(new Pair(p.x+1, p.y));
        }

        if (p.y - 1 >= 0) {
            next.add(new Pair(p.x, p.y-1));
        }
        return next;
    }

    public boolean isBorder(Pair p) {
        if (p.x == 0) { return true; }
        if (p.x == n - 1) { return true; }
        if (p.y == 0) { return true; }
        if (p.y == m - 1) { return true; }

        return false;
    }

    public class Pair {
        public int x;
        public int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}