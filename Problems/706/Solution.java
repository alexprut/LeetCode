class MyHashMap {
    int map[] = new int[1000001];
    public MyHashMap() {
        for (int i = 0; i < map.length; i++) {
            map[i] = Integer.MIN_VALUE;
        }
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key] != Integer.MIN_VALUE ? map[key] : -1;
    }

    public void remove(int key) {
        map[key] = Integer.MIN_VALUE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */