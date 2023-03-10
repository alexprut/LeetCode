/**
 Complexity: O(n)
 */

class SmallestInfiniteSet {

    int lowerBand = 1;
    TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        set = new TreeSet<Integer>();
    }

    public int popSmallest() {
        if (set.size() != 0) {
            if (set.first() < lowerBand) {
                return set.pollFirst();
            } else {
                lowerBand++;
                return lowerBand - 1;
            }
        } else {
            lowerBand++;
            return lowerBand - 1;
        }
    }

    public void addBack(int num) {
        if (num < lowerBand && !set.contains(num)) {
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */