class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        map.put(0,0);
        map.put(1,1);
        map.put(2,1);

        // T_0+3 = T_3 = T_0 + T_1 + T_2
        // T_1+3 = T_4 = T_1 + T_2 + T_3

        return calc(n);
    }

    public int calc(int n) {
        if (map.containsKey(n)) { return map.get(n); }
        map.put(n, calc(n - 3) + calc(n - 2) + calc(n - 1));
        return map.get(n);
    }
}