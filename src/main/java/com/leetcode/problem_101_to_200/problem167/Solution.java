package com.leetcode.problem_101_to_200.problem167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int  i=0,j=numbers.length-1;
        while(i<j && numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j] <target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}