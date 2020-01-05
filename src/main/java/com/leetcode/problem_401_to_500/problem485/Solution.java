package com.leetcode.problem_401_to_500.problem485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int local = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                local=0;
            }else{
                local++;
            }
            max =  Math.max(local, max);
        }
        return max;
    }
}