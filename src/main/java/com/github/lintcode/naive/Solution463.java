package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 12:39
 */
public class Solution463 {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here
        for (int i = 0;i<A.length;i++) {
            for (int j = 0;j < A.length-i-1;j++) {
                if (A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A [j+1];
                    A[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution463 solution463 = new Solution463();

        int[] demo = {3,2,1};
        solution463.sortIntegers(demo);
        System.out.println(demo);
    }
}
