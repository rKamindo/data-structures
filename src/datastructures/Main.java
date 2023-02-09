package datastructures;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(5);
        linkedList.addFirst(9);
        linkedList.display();
    }
}