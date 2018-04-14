package com.github.leetcode;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author : hongqiangren.
 * @since: 2018/4/9 10:20
 */
public class T3 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

    }

    private static Integer selectMax(List<Integer> e) {
        Integer temp = 0;
        for (int i = 0;i < e.size();i++) {
            if (e.get(i) >= temp) {
                temp = e.get(i);
            }
        }
        return temp;
    }
}
