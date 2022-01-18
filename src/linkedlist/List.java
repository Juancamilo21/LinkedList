package linkedlist;

public class List {

    private Node head;
    private int size;

    public List() {
        head = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (getHead() == null);
    }

    public Node last() {
        Node node = getHead();
        while (node.getNext() != null) {
            node = node.getNext();
        }
        return node;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) setHead(newNode);
        else last().setNext(newNode);
        size++;
    }

    public Node search(int data) {
        Node node = getHead();
        boolean found = false;
        while (node != null && !found) {
            found = (node.getData() == data);
            if (!found) node = node.getNext();
        }
        return node;
    }

    private Node previous(Node nodeDelete) {
        Node node = getHead();
        while (node.getNext() != nodeDelete) {
            node = node.getNext();
        }
        return node;
    }

    public void remove(Node nodeDelete) {
        Node previous;
        if (nodeDelete == getHead()) {
            setHead(getHead().getNext());
        } else {
            previous = previous(nodeDelete);
            previous.setNext(nodeDelete.getNext());
        }
        size--;
    }

    public void clean() {
        while (!isEmpty()) {
            remove(getHead());
        }
    }

    public void sort() {
        Node node = getHead(), next;
        int data;
        while (node != null) {
            next = node.getNext();
            while (next != null) {
                if (node.getData() > next.getData()) {
                    data = node.getData();
                    node.setData(next.getData());
                    next.setData(data);
                }
                next = next.getNext();
            }
            node = node.getNext();
        }
    }

    public Node get(int index) {
        Node node = getHead();
        int count = 0;
        while (count < index) {
            node = node.getNext();
            count++;
        }
        return node;
    }
}
