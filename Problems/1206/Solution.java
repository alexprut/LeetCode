class Skiplist {

    // maximum level of the skip list
    int maxLevel;

    // fraction of the nodes with level i pointers also having level i+1 pointers
    float p;

    // current level of skip list
    int currentLevel;

    // pointer to header node
    Node header;

    public Skiplist(int maxLevel, float p) {
        this.maxLevel = maxLevel;
        this.p = p;
        currentLevel = 0;
        header = new Node(-1, maxLevel);
    }

    public Skiplist() {
        this.maxLevel = 5;
        this.p = 0.5f;
        currentLevel = 0;
        header = new Node(-1, maxLevel);
    }

    private int randomLevel() {
        float r = (float) Math.random();
        int lvl = 0;
        while (r < p && lvl < maxLevel) {
            lvl++;
            r = (float) Math.random();
        }
        return lvl;
    }

    public boolean search(int key) {
        Node current = header;

        for (int i = currentLevel; i >= 0; i--) {
            while (current.next[i] != null && current.next[i].value < key) {
                current = current.next[i];
            }
        }
        current = current.next[0];

        if (current != null && current.value == key) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int key) {
        Node current = header;
        Node[] update = new Node[maxLevel + 1];

        for (int i = currentLevel; i >= 0; i--) {
            while (current.next[i] != null && current.next[i].value < key) {
                current = current.next[i];
            }
            update[i] = current;
        }

        current = current.next[0];

        int randomLevel = randomLevel();

        if (randomLevel > currentLevel) {
            for (int i = currentLevel + 1; i < randomLevel + 1; i++) {
                update[i] = header;
            }
            currentLevel = randomLevel;
        }

        Node n = new Node(key, randomLevel);

        for (int i = 0; i <= randomLevel; i++) {
            n.next[i] = update[i].next[i];
            update[i].next[i] = n;
        }
    }

    public boolean erase(int key) {
        Node current = header;
        Node[] update = new Node[maxLevel + 1];

        for (int i = currentLevel; i >= 0; i--) {
            while (current.next[i] != null && current.next[i].value < key) {
                current = current.next[i];
            }
            update[i] = current;
        }

        current = current.next[0];

        boolean isFound = false;
        if (current != null && current.value == key) {
            isFound = true;
        }

        if (current != null && current.value == key) {
            for (int i = 0; i < currentLevel; i++) {
                if (update[i].next[i] != current)
                    break;
                update[i].next[i] = current.next[i];
            }

            while (currentLevel > 0 && header.next[currentLevel] == null) {
                currentLevel--;
            }
        }

        return isFound;
    }

    protected class Node {
        int value;

        /**
         * array to hold pointers to node of different level
         */
        public Node[] next;

        Node(int value, int level) {
            this.value = value;
            next = new Node[level + 1];
        }
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */