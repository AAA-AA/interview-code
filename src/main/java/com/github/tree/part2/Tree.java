package com.github.tree.part2;

import com.github.tree.part1.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/3/20 10:28
 */
public class Tree {
    private TreeNode root;
    private int depth;
    private List<TreeNode> totalNodes = new ArrayList<TreeNode>();
    private boolean isInitial;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public List<TreeNode> getTotalNodes() {
        return totalNodes;
    }

    public void setTotalNodes(List<TreeNode> totalNodes) {
        this.totalNodes = totalNodes;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public void setInitial(boolean initial) {
        isInitial = initial;
    }
}
