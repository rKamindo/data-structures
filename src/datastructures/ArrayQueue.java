package datastructures;

import java.util.Queue;

public class ArrayQueue<T> {
    private T[] data;
    private int front;
    private int rear;
    public ArrayQueue(int capacity) {
        data = (T[]) new Object[capacity + 1]; // max array index is capacity - 1
        front = 0;
        rear = 0;
    }

    public void offer(T elem) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        data[rear++] = elem;
        rear = adjustIndex(rear, data.length);
    }

    public T poll() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        front = adjustIndex(front, data.length);
        return data[front++];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (front + data.length - rear) % data.length == 1;
    }

    private int adjustIndex(int index, int size) {
        return index >= size ? index - size : index;
    }
}