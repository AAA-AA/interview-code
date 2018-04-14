package com.github.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 22:33
 */
public class Solution1 {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        preorderTraversal(root.left);
        list.add(root.val);
        preorderTraversal(root.right);
        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
