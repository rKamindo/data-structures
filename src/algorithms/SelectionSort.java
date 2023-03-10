package algorithms;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        if (array == null) return;

        for (int i = 0; i < array.length; i++) {
            // find the index beyond i less than array[i]
            int swapIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[swapIndex]) {
                    swapIndex = j;
                }
            }
            swap(array, i, swapIndex);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
