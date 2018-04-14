package com.github.lintcode.naive;

/**
 * @author : hongqiangren.
 * @since: 2018/4/13 10:26
 */
public class Solution452 {

    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode next = head.next;
        while (next != null) {
            if (next.val == val) {
                cur.next = next.next;
            } else {
                cur = next;
            }
            next = next.next;
        }
        if (head.val == val) {
            head = null;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        removeElements(null, 2);
        System.out.println(node);
    }
}

