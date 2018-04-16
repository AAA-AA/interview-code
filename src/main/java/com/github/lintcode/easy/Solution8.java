package com.github.lintcode.easy;

/**
 * @author : hongqiangren.
 * @since: 2018/4/14 23:16
 */
public class Solution8 {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str.length == 0) {
            return;
        }
        offset = offset % str.length;
        char[] result = new char[str.length];
        for (int i = 0;i < offset && i < str.length;i++) {
            result[i] = str[str.length-offset+i];
        }
        for (int i = 0;i < str.length- offset;i++) {
            result[offset+i] = str[i];
        }
        for (int i = 0;i < result.length;i++) {
            str[i] = result[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String demo = "abcdefg";
        new Solution8().rotateString(demo.toCharArray(),3);
    }


}
