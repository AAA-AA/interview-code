package com.github.tree.part1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : hongqiangren.
 * @since: 2018/3/18 22:53
 */
public final class TreeHelper {

    private TreeHelper() {
    }

    /**
     * 树的合并
     *
     * @param treeOne 树一
     * @param treeTwo 树二
     * @return treeMerged 合并树
     */
    public static Tree merge(Tree treeOne, Tree treeTwo) {
        checkRooter(treeOne, treeTwo);
        Tree tree = new Tree();
        return merge(tree, treeOne, treeTwo);
    }

    private static Tree merge(Tree tree, Tree treeOne, Tree treeTwo) {
        tree.setRoot(new TreeNode(treeOne.getRoot().getName()));
        ;
        recursive(tree.getRoot().getChildNodes(), treeOne.getRoot().getChildNodes(), treeTwo.getRoot().getChildNodes());
        return tree;
    }

    private static void recursive(List<TreeNode> newer, List<TreeNode> original, List<TreeNode> target) {
        //遍历到根节点，直接返回
        if ((original == null || original.size() == 0) && (target == null || target.size() == 0)) {
            return;
        }
        //单边为空的情形
        if ((original != null && original.size() > 0) && (target == null || target.size() == 0)) {
            addAllCleanNode(newer, original);
            for (int i = original.size() - 1; i >= 0; i--) {
                doRecursive(newer.get(i).getChildNodes(), original.get(i).getChildNodes(), Collections.emptyList());
                return;
            }
        }
        //单边为空的情形
        if ((target != null && target.size() > 0) && (original == null || original.size() == 0)) {
            addAllCleanNode(newer, target);
            for (int i = target.size() - 1; i >= 0; i--) {
                doRecursive(newer.get(i).getChildNodes(), Collections.emptyList(), target.get(i).getChildNodes());
                return;
            }
        }
        doRecursive(newer, original, target);
    }

    //有两种实现思路：非递归方式、递归方式 非递归方式会存在树中重复节点计数问题(譬如同为node E,但挂载在不同的node)
    public static void compareAndPrint(Tree treeOne, Tree treeTwo) {
        checkRooter(treeOne, treeTwo);
        Set<String> setOne = getSetFromNodes(treeOne.getTotalNodes());
        Set<String> setTwo = getSetFromNodes(treeTwo.getTotalNodes());
        Set<String> added = new HashSet<>();
        for (String node : setOne) {
            if (!setTwo.contains(node)) {
                System.out.println(CompareResult.DELETE.name() + ":" + node);
            }
        }
        for (String node : setTwo) {
            if (!setOne.contains(node)) {
                added.add(node);
            }
        }
        StringBuilder targetString = new StringBuilder();
        targetString.append(CompareResult.ADD.name() + ":");
        added.forEach(e -> {
            targetString.append(e + "、");
        });
        System.out.println(targetString.deleteCharAt(targetString.length() - 1).toString());

    }

    private static Set<String> getSetFromNodes(List<TreeNode> nodes) {
        Set<String> set = new HashSet<>();
        nodes.forEach(e ->
                set.add(e.getName())
        );
        return set;
    }


    private static void doRecursive(List<TreeNode> newer, List<TreeNode> original, List<TreeNode> target){
        //鉴别两个节点是否同一应用节点(可以是string,亦可以是其他，依据业务设定)
        Set<String> addedNode = new HashSet<>();
        //沿targetNodes为主进行扫描
        for (int i = 0; i < target.size(); i++) {
            TreeNode tempNode = target.get(i);
            boolean exist = false;
            for (int j = 0; j < original.size(); j++) {
                if (tempNode.equals(original.get(j))) {
                    exist = true;
                    newer.add(new TreeNode(tempNode.getName()));
                    addedNode.add(tempNode.getName());
                    recursive(newer.get(newer.size() - 1).getChildNodes(), original.get(j).getChildNodes(), target.get(i).getChildNodes());
                }
            }
            if (!exist) {
                newer.add(tempNode);
                addedNode.add(tempNode.getName());
            }

        }
        //沿original进行扫描
        for (int i = 0; i < original.size(); i++) {
            //判断是否已添加至新的merge list
            TreeNode tempNode = original.get(i);
            if (addedNode.contains(tempNode.getName())) {
                continue;
            } else {
                newer.add(tempNode);
            }

        }
    }

    private static void addAllCleanNode(List<TreeNode> newer, List<TreeNode> target) {
       for (TreeNode treeNode:target) {
           newer.add(new TreeNode(treeNode.getName()));
       }
    }

    private static void checkRooter(Tree treeOne, Tree treeTwo) {
        if (treeOne == null || treeTwo == null) {
            throw new IllegalArgumentException("input tree can't be null！");
        }
        if (treeOne.getRoot() == null || treeOne.getRoot() == null) {
            throw new IllegalArgumentException("input legal tree please！");
        }
        //根节点名称相同（或者以其他规则表明两节点相同）
        if (!treeOne.getRoot().equals(treeTwo.getRoot())) {
            throw new IllegalArgumentException("both tree should have the same root Node! ");
        }
    }

    /**
     * 输出树的结构和统计信息
     *
     * @param tree
     */
    public static void printResult(String prefix, Tree tree) {
        System.out.println(prefix + tree);
    }

    private enum CompareResult {
        ADD, DELETE;
    }


}
