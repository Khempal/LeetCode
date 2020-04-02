package com.leetcode.problem_201_to_300.problem202;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n))
                return false;
            set.add(n);
            n = digitSquareSum(n);
        }
        return true;
    }

    private int digitSquareSum(int num) {
        int sum = 0;
        while (num % 10 > 0 || num / 10 > 0) {
            sum += Math.pow(num % 10, 2);
            num = num / 10;
        }
        return sum;
    }
}