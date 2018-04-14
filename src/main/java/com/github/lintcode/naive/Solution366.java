package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 00:19
 */
public class Solution366 {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1 || n == 2) {
            return n - 1;
        }
        int first = 0,second = 1,temp = 1;
        int index = 3;
        while (index <= n) {
            temp = first+second;
            first = second;
            second = temp;
            index++;
        }
        return temp;
    }
}
