package algorithms;


import datastructures.Stack;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {3, 13, -2, 55, 9, 4};
        MergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
