package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] values) {
        insertionSort(values);
    }

    // Sort the given array using insertion sort. The idea behind
    // insertion sort is that at the array is already sorted from
    // [0, i] and you want to add the element from position i + 1
    // so you 'insert' it at the appropriate location
    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(Arrays.toString(a));
            int key = a[i + 1]; // key is the element that is to be inserted
            int j;

            // we are comparing the value of elements to key
            // to find the correct position for it
            // loop runs while key is less than the
            // compared element, and
            // until the compared element index is > 0
            for (j = i + 1; j > 0 && key < a[j - 1]; j--) {
                a[j] = a[j - 1]; // shifts the elements
            }
            a[j] = key; // insert at the correct position
        }
    }
    public static void display(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
