package com.github.leetcode.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 23:13
 */
public class SolutionBFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resultList = new LinkedList<List<Integer>>();
        if (root == null) return resultList;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNodeNumber = queue.size();
            List<Integer> valueList = new ArrayList<>();
            for (int  i = 0;i < levelNodeNumber;i++) {
                if (queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                valueList.add(queue.poll().val);
            }
            resultList.add(valueList);
        }
        return resultList;
    }

    public static void main(String[] args) {
        int n = 11;

        int counter = 0;
        while (n >= 5) {
            if (n % 5 == 0) {
                int marker = 0;
                int exchange = n;
                while (exchange % 5 == 0 && exchange > 0) {
                    marker++;
                    exchange = exchange / 5;
                }
                counter = counter + marker;
            }
            n--;
        }
        System.out.println(counter);






        int a = 10,b = -10;
        while(b!=0) {
            int _a = a^b;
            int _b = (a&b)<<1;
            a = _a;
            b = _b;
        }
        System.out.println(a);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
