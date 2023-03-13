/**
 Space complexity: O(n*m)
 Time complexity: O(n*m)

 */
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    Stack<ArrayList<Integer>> stack = new Stack();
                    ArrayList<Integer> pair = new ArrayList<Integer>();
                    pair.add(i);
                    pair.add(j);
                    stack.push(pair);
                    int counter = 0;
                    counter++;
                    grid[i][j] = 0;
                    while (!stack.empty()) {
                        ArrayList<Integer> p = stack.pop();
                        // Top
                        if (p.get(0) - 1 >= 0 && grid[p.get(0) - 1][p.get(1)] == 1) {
                            ArrayList<Integer> pa = new ArrayList<Integer>();
                            pa.add(p.get(0) - 1);
                            pa.add(p.get(1));
                            stack.push(pa);
                            counter++;
                            grid[p.get(0) - 1][p.get(1)] = 0;
                        }
                        // Bottom
                        if (p.get(0) + 1 < grid.length && grid[p.get(0) + 1][p.get(1)] == 1) {
                            ArrayList<Integer> pa = new ArrayList<Integer>();
                            pa.add(p.get(0) + 1);
                            pa.add(p.get(1));
                            stack.push(pa);
                            counter++;
                            grid[p.get(0) + 1][p.get(1)] = 0;
                        }
                        // Left
                        if (p.get(1) - 1 >= 0 && grid[p.get(0)][p.get(1) - 1] == 1) {
                            ArrayList<Integer> pa = new ArrayList<Integer>();
                            pa.add(p.get(0));
                            pa.add(p.get(1) - 1);
                            stack.push(pa);
                            counter++;
                            grid[p.get(0)][p.get(1) - 1] = 0;
                        }
                        // Right
                        if (p.get(1) + 1 < grid[p.get(0)].length && grid[p.get(0)][p.get(1) + 1] == 1) {
                            ArrayList<Integer> pa = new ArrayList<Integer>();
                            pa.add(p.get(0));
                            pa.add(p.get(1) + 1);
                            stack.push(pa);
                            counter++;
                            grid[p.get(0)][p.get(1) + 1] = 0;
                        }
                    }

                    maxArea = (maxArea < counter) ? counter: maxArea;
                }
            }
        }

        return maxArea;
    }
}