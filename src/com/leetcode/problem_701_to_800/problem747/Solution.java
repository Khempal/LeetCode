package com.leetcode.problem_701_to_800.problem747;

class Solution {
    public int dominantIndex(int[] nums) {
        int large = 0, second = 0, largeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                second = large;
                largeIndex = i;
                large = nums[i];
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        if (second == 0 && large > 0) {
            return largeIndex;
        }

        if (large / second >= 2) {
            return largeIndex;
        }
        return -1;
    }
}