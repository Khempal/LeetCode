package com.leetcode.problem_1201_to_1300.problem1299;

class Solution {
    public int[] replaceElements(int[] arr) {
        int large = -1;
        int temp = 0;
        for(int i=arr.length-1; i>=0; i--){
            temp = arr[i];
            arr[i] = large;
            large = Math.max(large, temp);
        }
        return arr;
    }
}