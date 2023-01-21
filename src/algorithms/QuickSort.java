package algorithms;

public class QuickSort {

    public static void sort(int[] arr, int low, int high) {
        quickSort(arr, low, high);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot) to
       left of pivot and all greater elements to right of pivot
     */
    public static int partition(int[] arr, int low, int high) {

        // pivot set to last element
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }

        // finally swap pivot to the correct position
        swap (arr, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index
            // arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition;
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
