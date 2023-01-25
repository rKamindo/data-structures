package datastructures;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T>{
    private int size;
    private int capacity;
    private T[] data;

    public ArrayStack() {
        capacity = 16;
        data = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem) {
        if (size == capacity) {
            increaseCapacity();
        }
        data[size++] = elem;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        T elem = data[--size];
        data[size] = null;
        return elem;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return data[size - 1];
    }

    // increase the capacity to store more elements
    private void increaseCapacity() {
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }
}
