package com.leetcode.problem_101_to_200.problem189;

class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        if (size > 0) {
            k %= size;
            for (int i = 1; i <= k; i++) {
                moveRight(nums);
            }
        }
    }

    private void moveRight(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = last;
    }
}