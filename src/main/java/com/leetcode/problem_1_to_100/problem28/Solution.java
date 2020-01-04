package com.leetcode.problem_1_to_100.problem28;

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null||needle.isEmpty()){
            return  0;
        }
        
        return haystack.indexOf(needle);
    }
}