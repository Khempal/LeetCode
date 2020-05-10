package com.leetcode.problem_301_to_400.problem367;

class Solution {
    public boolean isPerfectSquare(int num) {
        
        int left =  1;
        int right = num;
        
        
        while(left < right){
            int mid =  left - (left - right)/2;
            int sqr = mid * mid;
            if( sqr == num){
                return true;
            }else if(sqr > num){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        
        return false;
    }
}