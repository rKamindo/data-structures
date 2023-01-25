package algorithms;

import datastructures.Array;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {2, 0, -1, 55, 33, 1};
        BubbleSort.sort(nums);
        System.out.println(Arrays.toString(nums));

        Array<Integer> arr = new Array<>(3);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.removeAt(4);
        arr.add(9);
        System.out.println(arr);

    }
}
