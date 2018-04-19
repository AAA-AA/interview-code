package com.github.lintcode.easy;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/4/18 20:37
 */
public class Solution22 {


    //1. 递归解法
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for (NestedInteger nestedInteger:nestedList) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else {
                list.addAll(flatten(nestedInteger.getList()));
            }
        }
        return list;
    }

    //2. 非递归解法
    public List<Integer> flatten2(List<NestedInteger> nestedList) {
        boolean isFlat = true;
        List<NestedInteger> ls = nestedList;
        while (isFlat) {
            isFlat = false;
            List<NestedInteger> newLs = new ArrayList<>();
            for (NestedInteger ni : ls) {
                if (ni.isInteger()) {
                    newLs.add(ni);
                } else {
                    newLs.addAll(ni.getList());
                    isFlat = true;
                }
            }
            ls = newLs;
        }
        List<Integer> r = new ArrayList<>();
        for (NestedInteger ni : ls) {
            r.add(ni.getInteger());
        }
        return r;

    }



    public static void main(String[] args) {
        List<NestedInteger> list = new ArrayList<>();

    }


    interface NestedInteger {
        boolean isInteger();

        Integer getInteger();

        List<NestedInteger> getList();
    }
}
