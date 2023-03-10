/**
 TreeSet
 lastIndex
 previousIndex
 increment index or lower index
 */
class SORTracker {
    TreeSet<Location> set = new TreeSet<>();
    Location lastReturned = new Location("", Integer.MAX_VALUE);

    public SORTracker() {
    }

    /**
     Time complexity: O(nlogn)
     Space complexity: O(n)
     */
    public void add(String name, int score) {
        Location l = new Location(name, score);
        set.add(l);
        if (l.compareTo(lastReturned) < 0) {
            lastReturned = set.lower(lastReturned);
        }
    }

    /**
     Time complexity: O(n)
     Space complexity: O(1)
     */
    public String get() {
        lastReturned = set.higher(lastReturned);
        return lastReturned.name;
    }

    private class Location implements Comparable<Location> {
        String name;
        int score;
        Location(String n, int s) {
            name = n;
            score = s;
        }

        public int compareTo(Location l) {
            return score != l.score ? -Integer.compare(score, l.score) : name.compareTo(l.name);
        }
    }
}

/**
 * Your SORTracker object will be instantiated and called as such:
 * SORTracker obj = new SORTracker();
 * obj.add(name,score);
 * String param_2 = obj.get();
 */