package datastructures;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Queue;

public class ArrayQueue<T> {
    private T[] data;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        data = (T[]) new Object[capacity + 1];
        front = 0;
        rear = 0;
    }

    // adds an element to the front of the queue
    public void offer(T elem) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        data[rear++] = elem;
        rear = adjustIndex(rear, data.length);
    }

    // removes and returns the element at the front of the queue
    public T poll() {
        if (isEmpty())
            throw new EmptyStackException();
        front = adjustIndex(front, data.length);
        return data[front++];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (front + data.length - rear) % data.length == 1;
    }

    public int adjustIndex(int index, int size) {
        return index >= size ? index - size : index;
    }
}