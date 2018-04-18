package com.github.lintcode.easy;

/**
 * @author : hongqiangren.
 * @since: 2018/4/17 23:36
 */
public class Solution14 {

    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        if (nums[0] == target) return 0;
        int result = search(nums, 0, nums.length, target);
        return result;
    }

    private int search(int[] nums, int left, int right, int target) {
        int mid = (left + right) / 2;
        if (left >= right || left+1 == right) {
            return -1;
        }
        if (nums[mid] == target && nums[mid-1] != target) {
            return mid;
        }
        if (target <= nums[mid]) return search(nums, left, mid, target);
        if (target > nums[mid]) return search(nums,mid,right,target);

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {4,5,9,9,12,13,14,15,15,18};
        int i = new Solution14().binarySearch(arr, 10);
        System.out.println(i);

    }
}
