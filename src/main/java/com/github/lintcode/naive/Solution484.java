package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 19:35
 */
public class Solution484 {


    /**
     * @param A: An integer array
     * @param index1: the first index
     * @param index2: the second index
     * @return: nothing
     */
    public void swapIntegers(int[] A, int index1, int index2) {
        // write your code here
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }



}
