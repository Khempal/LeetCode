package com.leetcode.problem_1_to_100.problem8;

class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int index = 0;
        StringBuilder result = new StringBuilder();
        boolean isNegative = false;

        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            isNegative = (str.charAt(index) == '-');
            index++;
        }

        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            result.append(str.charAt(index));
            index++;
        }

        if (result.length() == 0)
            return 0;

        if (isNegative)
            result.insert(0, '-');

        try {
            return Integer.parseInt(result.toString());
        } catch (NumberFormatException e) {
            if (isNegative)
                return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }
}