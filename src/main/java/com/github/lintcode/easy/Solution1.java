package com.github.lintcode.easy;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 22:24
 */
public class Solution1 {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        return (a^b)^((a&b)<<1);
    }

}
