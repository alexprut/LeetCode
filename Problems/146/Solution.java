class LRUCache {

    LinkedHashMap<Integer, Integer> map;
    private final int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new LinkedHashMap<>(capacity, 1, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cap;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */