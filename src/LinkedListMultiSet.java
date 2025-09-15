
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
        return false;
    }

    public boolean isEmpty() {
        return false;
    }


    public int count(int item) {
        return -1;
    }

    public int size() {
        return -1;
    }
}
