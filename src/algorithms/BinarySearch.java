package algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static int iterativeSearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int recursiveSearch(int[] array, int left, int right, int target) {
        if (left > right)
            return -1;

        int mid = (left + right) / 2;
        if (array[mid] == target)
            return mid;
        else if (array[mid] < target)
            return recursiveSearch(array, mid + 1, right, target);
        else
            return recursiveSearch(array, left, mid - 1, target);
    }
}
