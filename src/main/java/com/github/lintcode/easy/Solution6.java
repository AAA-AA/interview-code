package com.github.lintcode.easy;

import java.util.*;

/**
 * @author : hongqiangren.
 * @since: 2018/4/14 23:06
 */
public class Solution6 {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        List<Integer> list = new ArrayList<>();
        for (Integer numA:A) {
            list.add(numA);
        }
        for (Integer numB:B) {
            list.add(numB);
        }
        // write your code here
        Collections.sort(list,Comparator.naturalOrder());
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {2, 4, 5, 6};
        new Solution6().mergeSortedArray(a,b);
    }

}
