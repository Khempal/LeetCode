package com.leetcode.problem_1_to_100.problem7;

class Solution {
    // Basic
    public int reverse(int x) {
        StringBuilder orig = new StringBuilder(Integer.toString(x));
        int low = 0, high = orig.length() - 1;
        if (orig.charAt(0) == '-') {
            low = 1;
        }
        while (low <= high) {
            char temp = orig.charAt(low);
            orig.setCharAt(low, orig.charAt(high));
            orig.setCharAt(high, temp);
            low++;
            high--;
        }
        try {
            return Integer.parseInt(orig.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverseInt(int x) {
        long result = 0;
        while (x != 0) {
            result = result*10 + x%10;
            x /= 10;
        }
        if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) {
            return (int) result;
        }
        return 0;
    }
}