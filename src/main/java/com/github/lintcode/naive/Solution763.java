package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/14 21:15
 */
public class Solution763 {

    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
        // write your code here
        StringBuffer builder = new StringBuffer();
        String charNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (n / k != 0) {
            int remainder = n % k;
            if (remainder > 9 && remainder < k) {
                builder.append(charNum.charAt(remainder-10));
            } else {
                builder.append(remainder);
            }
            n = n / k;
        }
        if (n > 9) {
            builder.append(charNum.charAt(n-10));
        } else {
            builder.append(n);
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0;i < builder.length();i++) {
            result.append(builder.charAt(builder.length()-i-1));
        }
        return result.toString();
    }
}
