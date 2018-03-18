package com.github.tree.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/3/18 22:32
 */
public class Tree {

    private TreeNode root;
    private int depth;
    private List<TreeNode> totalNodes = new ArrayList<TreeNode>();
    private boolean override;

    public void init() {
        if (root == null) {
            throw new IllegalArgumentException("根结点不能为空");
        }
        if (override) {
            return;
        }
        if (!override) {
            depth = getTreeDepth(root);
            override = true;
        }
    }

    public boolean exist(TreeNode node) {
        init();
        for (TreeNode treeNode : totalNodes) {
            //此处可根据具体的业务逻辑作调整
            if (node.getName().equals(treeNode.getName())) {
                return true;
            }
        }
        return false;
    }


    private int getTreeDepth(TreeNode root) {
        totalNodes.add(root);
        List<Integer> depth = new ArrayList<Integer>();
        if (root.getChildNodes() == null || root.getChildNodes().size() == 0) {
            return 1;
        }
        for (int i = 0; i < root.getChildNodes().size(); i++) {
            int temp;
            temp = getTreeDepth(root.getChildNodes().get(i)) + 1;
            depth.add(temp);
        }
        Collections.sort(depth, Collections.reverseOrder());
        return depth.get(0);
    }


    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getDepth() {
        init();
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

    public boolean isOveride() {
        return override;
    }

    public void setOveride(boolean overide) {
        this.override = overide;
    }

    @Override
    public String toString() {
        return "{" +
                "root=" + root +
                ", depth=" + depth +
                ", totalNodes=" + totalNodes.size() +
                '}';
    }
}
