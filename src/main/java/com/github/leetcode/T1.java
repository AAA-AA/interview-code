package com.github.leetcode;

/**
 * @author : hongqiangren.
 * @since: 2018/4/4 18:37
 */
public class T1 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 9,15};
        int target = 23;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sort(nums);
        System.out.println(nums);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


    }

    public static int[] twoSum(int[] sums, int target) {
        int[] result = new int[2];
        if (sums == null) {
            throw new IllegalArgumentException("传参错误");
        }
        for (int i = 0; i < sums.length; i++) {
            int num1 = sums[i];
            for (int j = i + 1; j < sums.length; j++) {
                int num2 = sums[j];
                if (num1 + num2 == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
