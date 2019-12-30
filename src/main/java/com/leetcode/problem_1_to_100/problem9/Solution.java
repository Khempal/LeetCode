package com.leetcode.problem_1_to_100.problem9;

class Solution {
    public boolean isPalindromeByString(int x) {
        String checker = Integer.toString(x);
        int lo = 0, high = checker.length() - 1;
        while (lo <= high) {
            if (checker.charAt(lo) != checker.charAt(high)) {
                return false;
            }
            lo++;
            high--;
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x > 0)) {
            return false;
        }
        int res = 0;
        while (res < x) {
            res = res * 10 + (x % 10);
            x /= 10;
        }

        return x == res || x == res / 10;
    }
}