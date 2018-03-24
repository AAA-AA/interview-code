package com.github.tree.part2;

/**
 * @author : hongqiangren.
 * @since: 2018/3/20 10:19
 */
public class TreeNode {

    private String uuid;//该节点的唯一标识
    private String data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
