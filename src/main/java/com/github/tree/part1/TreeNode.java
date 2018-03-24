package com.github.tree.part1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/3/18 22:31
 */
public class TreeNode {
    private String name;
    private TreeNode parentNode;
    private List<TreeNode> childNodes;

    public TreeNode(String name) {
        this.name = name;
        this.childNodes = new ArrayList<>();
    }

    //定义equals规则
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TreeNode) {
            TreeNode node = (TreeNode) obj;
            return node.name.equals(name);
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(TreeNode parentNode) {
        this.parentNode = parentNode;
    }

    public List<TreeNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<TreeNode> childNodes) {
        this.childNodes = childNodes;
    }
}
