package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        exchangeSort(arr);
    }

    // Sort the array using bubble sort. The idea behind
    // bubble sort is to look for adjacent indexes which
    // are out of place and interchange their elements
    // until the entire array is sorted.
    public static void exchangeSort(int[] array) {
        boolean sorted;

        do {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    sorted = false;
                }
            }
        } while (!sorted);
    }


    private static void swap(int[] ar, int i, int j) {
        int tmp = ar[i];
        ar[i] = ar[j];
        ar[j] = tmp;
    }
}
