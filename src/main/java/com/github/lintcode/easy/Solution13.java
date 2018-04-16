package com.github.lintcode.easy;

/**
 * @author : hongqiangren.
 * @since: 2018/4/14 23:54
 */
public class Solution13 {
    /*
    * @param source: source string to be scanned.
    * @param target: target string containing the sequence of characters to match
    * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
    */
    public int strStr(String source, String target) {
        // write your code here
        int result = -1;
        if (source == null) {
            return -1;
        }
        if (target.length() == 0) {
            result = 0;

        }
        if (source.length() < target.length()) {
            return result;
        }
        if (source.length() == 0 && target.length() == 0) {
            return 0;
        }
        for (int i = 0;i < source.length();i++) {
            int targetPointer = 0;
            char temp = target.charAt(targetPointer);
            int index = i;
            if (temp == source.charAt(index)) {
                result = index;
                while (target.charAt(targetPointer) == source.charAt(index)) {
                    targetPointer++;
                    index++;
                    if (targetPointer == target.length()-1) {
                        break;
                    }
                    if (index > source.length()-1) {
                        break;
                    }
                }
                if (targetPointer != target.length()-1) {
                    result = -1;
                }else {
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution13().strStr("abcde", "e");
    }
}
