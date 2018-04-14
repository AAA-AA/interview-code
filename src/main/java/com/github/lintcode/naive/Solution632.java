package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 19:39
 */
public class Solution632 {

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        TreeNode max = root;
        if (root.left != null) {
            TreeNode left = maxNode(root.left);
            max = max.val > left.val ? max : left;
        }
        if (root.right != null) {
            TreeNode right = maxNode(root.right);
            max = max.val > right.val ? max : right;
        }
        return max;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}
