package com.leetcode.problem_1_to_100.problem2;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode result = null;
        ListNode currNodeInResult = null;
        int carry = 0;
        // iterate through both the list and store result in other  list;
        // carry forward
        // iterate till both of them are null

        while (head1 != null || head2 != null || carry > 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            if (result == null) {
                result = new ListNode(sum % 10);
                currNodeInResult = result;
                carry = sum / 10;
            } else {
                currNodeInResult.next = new ListNode(sum % 10);
                currNodeInResult = currNodeInResult.next;
                carry = sum / 10;
            }
        }

        // return result linkedlist
        return result;
    }
}