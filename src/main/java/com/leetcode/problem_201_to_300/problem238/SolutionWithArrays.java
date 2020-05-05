package com.leetcode.problem_201_to_300.problem238;

class SolutionWithArrays {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int [] front =  new int[nums.length];
        int [] rear =  new int[nums.length];
        
        front[0]=1;
        for(int i=1;i<nums.length;i++){
            front[i] = front[i-1]*nums[i-1];
        }
        
        rear[nums.length-1] =  1;
        for(int i=nums.length-2; i>=0; i--){
            rear[i] = rear[i+1]*nums[i+1];
        }
        
        for(int i=0; i<nums.length;i++){
            result[i] =  front[i]*rear[i];
        }
        
        return result;
    }
}