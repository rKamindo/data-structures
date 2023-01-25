package algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int arr[], int fromIndex, int toIndex, int key) {

        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }

        return -1;
    }

}
