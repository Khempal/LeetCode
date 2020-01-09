package com.leetcode.problem_101_to_200.problem209;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    found = true;
                    minLength = Math.min(minLength, j + 1 - i);
                    break;
                }
            }
        }
        return found ? minLength : 0;
    }
}