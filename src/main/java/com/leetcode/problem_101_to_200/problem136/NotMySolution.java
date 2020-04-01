package com.leetcode.problem_101_to_200.problem136;

class NotMySolution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans ^= nums[i];
        }
        
        return ans;
    }
}