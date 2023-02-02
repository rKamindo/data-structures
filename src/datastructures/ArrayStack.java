package datastructures;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private T[] stack;
    private int size;
    private int capacity;

    public ArrayStack(int capacity) {
        stack = (T[]) new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // adds an element to the top of the stack
    public void push(T elem) {
        if (size == capacity) // time to resize
            increaseCapacity();
        stack[size++] = elem;
    }

    // removes and returns the element at the top of the stack
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        T data = stack[--size];
        stack[size] = null;
        return data;
    }

    // returns the element at the top of the stack
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack[size - 1];
    }

    private void increaseCapacity() {
        capacity *= 2;
        stack = Arrays.copyOf(stack, capacity);
    }
}