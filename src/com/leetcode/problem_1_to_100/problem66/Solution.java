package com.leetcode.problem_1_to_100.problem66;

class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        int curSum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            curSum = digits[i] + 1;
            digits[i] = curSum % 10;
            carry = false;
            if (curSum > 9) {
                carry = true;
            }
            if (!carry) {
                break;
            }
        }
        if (carry) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i <= digits.length; i++) {
                res[i] = digits[i - 1];
            }
            return res;
        }
        return digits;
    }
}