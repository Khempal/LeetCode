package com.leetcode.problem_801_to_900.problem876;

class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next != null) {
//            fast = fast.next;
            slow = slow.next;
        }

        return slow;

    }
}