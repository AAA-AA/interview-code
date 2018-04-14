package com.github.leetcode;

import java.util.*;

/**
 * @author : hongqiangren.
 * @since: 2018/4/4 18:37
 */
public class T2 {

    public static void main(String[] args) {
        int[] s = {0,14,-7,2,7,11,-9,11,-12,6,-10,-8,9,-3,7,-6,3,4,14,-10,-8,5,-1,6,12,9,12,-11,-15,-5,5,0,-6,13,9,9,10,7,5,13,-2,11,-10,-15,-15,4,-14,-4,-15,7,-7,-15,-3,8,-2,-13,-6,-5,-9,-14,5,12,1,6,2,-12,-8,-11,10,13,-13,-14,1,14,8,1,-4,9,4,-12,-6,13,10,6,6,-7,8,7,3,7,8,-15,-4,-14,-1,13,-11,6,-12,-15,4,12,8,-10,4,1,-1,7,-13,-12,10,-4,8,6,10,-1,6,-5,13,-13,9,6,-13,-10};
        Long cur = System.currentTimeMillis();
        threeSum(s);
        System.out.println(String.format("cost:%s",System.currentTimeMillis()-cur));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0;i < nums.length-2;i++) {
            int num1 = nums[i];
            for (int j = i+1;j < nums.length;j++) {
                int num2 = nums[j];
                for (int k = j+1; k < nums.length;k++) {
                    int num3 = nums[k];
                    if (num1 + num2 + num3 == 0) {
                        List<Integer> demo = new ArrayList<>();
                        demo.add(num1);
                        demo.add(num2);
                        demo.add(num3);
                        if (!checkContains(list,demo)) {
                            list.add(demo);
                        }
                    }
                }
            }
        }
        return list;
    }

    private static boolean checkContains(List<List<Integer>> list, List<Integer> demo) {
        for (List<Integer> child:list) {
            if (compare(child,demo)) {
                return true;
            }
        }
        return false;
    }

    private static boolean compare(List<Integer> coll1, List<Integer> coll2) {
        for (Integer num : coll1) {
            if (!coll2.contains(num)) {
                return false;
            }
        }
        for (Integer num:coll2) {
            if (!coll1.contains(num)) {
                return false;
            }
        }
        return true;
    }
}
