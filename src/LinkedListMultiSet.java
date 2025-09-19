
// Node is only used inside the LinkedList class, so we define it in the same file;
// there can only be one public class in a file, but there can also be non-public classes.
class Node {
    int item;
    Node next;
    Node(int item) {
        this.item = item;
        this.next = null;
    }
}


public class LinkedListMultiSet extends MultiSet {

    // a linked list initially is empty
    private Node front = null;
    private int size = 0;


    public void add(int item) {
        Node newNode =  new Node(item);
        newNode.next = front;
        front = newNode;
        size += 1;
    }

    public void remove(int item) {
        Node cur = this.front;
        Node prev = null;
        while (cur != null) {
            if (cur.item == item) {
                this.size -= 1;
                if (prev != null) {
                    prev.next = cur.next;
                } else {
                    this.front = cur.next;
                }
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }

    public boolean contains(int item) {
        Node cur = this.front;
        while (cur != null) {
            if (cur.item == item) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.front == null;
    }


    public int count(int item) {
        int num_seem = 0;
        Node cur = this.front;
        while (cur != null) {
            if (cur.item == item) {
                num_seem++;
            }
            cur = cur.next;
        }
        return num_seem;
    }

    public int size() {
        return this.size;
    }
}
