package com.leetcode.problem_1_to_100.problem26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[slow] == nums[fast]){
                fast++;
            }else{
                nums[++slow] = nums[fast++];
            }
        }
        
        return slow+1;
    }
}