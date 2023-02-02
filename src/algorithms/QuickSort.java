package algorithms;

public class QuickSort {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // O(nlog(n))
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right)
            return;
        // set pivot in the middle
        int pivot = array[(left + right) / 2];
        // get the index where the partition happened.
        int index = partition(array, left, right, pivot);

        // sort left partition
        quickSort(array, left, index - 1);
        // sort right partition
        quickSort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot)
                left++;
            while (array[right] > pivot)
                right--;
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
