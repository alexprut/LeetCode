class MyLinkedList {

    protected class Node {
        int val;
        Node next;

        Node(int v) {
            val = v;
            next = null;
        }
    }

    private Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) { return -1; }
        Node current = head;
        int i = 0;
        while (i < index) {
            i++;
            current = current.next;
        }

        return current.val;
    }

    public void addAtHead(int val) {
        size++;
        Node n = new Node(val);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void addAtTail(int val) {
        size++;
        Node n = new Node(val);
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public void addAtIndex(int index, int val) {
        Node n = new Node(val);
        if (index > size) { return; }
        size++;
        int i = 0;
        Node prev = null;
        Node current = head;
        while (i < index) {
            i++;
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            n.next = head;
            head = n;
        } else {
            prev.next = n;
            n.next = current;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= size) { return; }
        size--;
        int i = 0;
        Node prev = null;
        Node current = head;
        while (i < index) {
            i++;
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = current.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */