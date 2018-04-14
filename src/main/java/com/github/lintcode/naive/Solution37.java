package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 00:19
 */
public class Solution37 {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int num1 = number / 100;
        int num2 = (number%100)/10;
        int num3 = number%10;

        return num3*100+num2*10+num1;

    }
}
