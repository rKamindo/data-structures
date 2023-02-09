package datastructures;

public class SinglyLinkedList<T> {
    private Node<T> head = null;
    private int size;

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T elem, Node next) {
            data = elem;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    // returns whether the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // add to the end of the linked list
    public void add(T elem) {
        addLast(elem);
    }

    public void addFirst(T elem) {
        if (isEmpty())
            head = new Node<>(elem, null);
        else {
            head = new Node<>(elem, head);
        }
        size++;
    }

    // adds to the end of the linked list
    public void addLast(T elem) {
        Node trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = new Node<>(elem, null);
    }

    // linear search the linked list for a node with its equal to key
    public Node find(T key) {
        // cant search an empty list
        if (isEmpty())
            throw new RuntimeException("Empty list");

        Node trav = head;
        while (trav != null) {
            if (trav.data == key)
                return trav;
        }
        return null;
    }

    // removes the element at the head of the list
    public T removeFirst() {
        // can't remove from an empty list
        if (isEmpty())
            throw new RuntimeException("Empty list");

        // Extract the data
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T removeLast() {
        // cant remove from an empty list
        if (isEmpty())
            throw new RuntimeException("Empty list");

        // find the node before the last node
        Node trav = head;
        while (trav.next.next != null) {
            trav = trav.next;
        }
        T data = trav.next.data;
    }

    public void display() {
        Node trav = head;
        while (trav != null) {
            System.out.println(trav.data);
            trav = trav.next;
        }
    }
}
