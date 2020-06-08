package com.leetcode.problem_201_to_300.problem231;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        int x = n - 1;
        return (n & x) == 0;
    }
}