package com.lambdaworks.internal;

@FunctionalInterface
interface IntFilter {
    boolean filter(int num);
}

public class IntFilterTest {
    public static void filterAndPrint(int[] arr, IntFilter filter) {
        for (int num : arr)
            if (filter.filter(num)) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        filterAndPrint(nums, n -> n % 2 == 0); // 2 4 6
    }
}
