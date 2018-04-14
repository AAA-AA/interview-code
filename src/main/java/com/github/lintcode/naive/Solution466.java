package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 19:27
 */
public class Solution466 {

    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public static int countNodes(ListNode head) {
        // write your code here
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);
        System.out.println(countNodes(node));
    }
}
