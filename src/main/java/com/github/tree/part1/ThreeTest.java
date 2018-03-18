package com.github.tree.part1;

import org.junit.Test;

/**
 * @author : hongqiangren.
 * @since: 2018/3/18 23:07
 */
public class ThreeTest {



    @Test
    public void testPart1() {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode b = new TreeNode("b");
        TreeNode f = new TreeNode("f");
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");

        TreeNode R = new TreeNode("R");
        TreeNode S = new TreeNode("S");
        TreeNode T = new TreeNode("T");

        testGroup1(A, B, C);

    }

    private static void testGroup1(TreeNode A, TreeNode B, TreeNode C) {
        Tree tree1 = new Tree();
        tree1.setRoot(new TreeNode(A.getName()));
        tree1.init();

        Tree tree2 = new Tree();
        B.getChildNodes().add(C);
        TreeNode cleanNode = new TreeNode(A.getName());
        cleanNode.getChildNodes().add(B);
        tree2.setRoot(cleanNode);
        tree2.init();

        Tree merge = TreeHelper.merge(tree1, tree2);
        merge.init();

        TreeHelper.printResult("tree1", tree1);
        TreeHelper.printResult("tree2", tree2);
        TreeHelper.compareAndPrint(tree1, tree2);
        TreeHelper.compareAndPrint(tree1, merge);
        System.out.println("******************************************");
    }

}
