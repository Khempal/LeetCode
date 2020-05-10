package com.leetcode.problem_1001_to_1100.problem1051;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] newArr = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            newArr[i]=heights[i];
        }
        Arrays.sort(newArr);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(newArr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}