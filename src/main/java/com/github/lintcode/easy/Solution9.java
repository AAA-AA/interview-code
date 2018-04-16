package com.github.lintcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/4/14 23:45
 */
public class Solution9 {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                list.add("fizz buzz");
                continue;
            }
            if (i % 5 == 0) {
                list.add("buzz");
                continue;
            }
            if (i % 3 == 0) {
                list.add("fizz");
                continue;
            }
            list.add(String.valueOf(i));
        }
        return list;

    }
}
