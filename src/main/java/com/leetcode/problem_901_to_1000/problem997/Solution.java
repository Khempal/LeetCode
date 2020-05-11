package com.leetcode.problem_901_to_1000.problem997;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n];
        
        for(int i=0; i<trust.length; i++){
            trusted[trust[i][0] -1]--;
            trusted[trust[i][1] -1]++;
        }
        for(int i=0; i<n;i++){
            if(trusted[i] == n-1){
                return i+1;
            }
        }
        return -1;
    }
}