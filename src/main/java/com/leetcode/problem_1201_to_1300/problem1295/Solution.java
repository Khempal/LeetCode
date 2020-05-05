package com.leetcode.problem_1201_to_1300.problem1295;

class Solution {
    public int findNumbers(int[] nums) {
        int evenCount =  0;
        for(int i=0;i<nums.length;i++){
            if(isEvenDigits(nums[i])){
                evenCount+=1;
            }
        }
        return evenCount;
    }
    
    private boolean isEvenDigits(int num){
        int length = 0 ;
        while(num>0){
            num = num/10;
            length+=1;
        }
        return length%2==0;
    }
}