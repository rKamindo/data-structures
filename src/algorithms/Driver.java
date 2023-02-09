package algorithms;


import datastructures.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {

    }

    // time O(n), memory O(1)
    public static int maxProduct(int[] nums) {
        int result = Arrays.stream(nums).max().getAsInt();
        int curMin = 1;
        int curMax = 1;

        for (int n : nums) {
            if (n == 0) {
                curMin = 1;
                curMax = 1;
                continue;
            }

            int temp = curMax * n;
            curMax = Math.max(Math.max(n * curMax, n * curMin), n);
            curMin = Math.min(Math.min(temp, n * curMin), n);
            result = Math.max(result, curMax);
        }
        return result;
    }

}
