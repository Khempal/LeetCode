package com.leetcode.problem_1_to_100.problem67;

class Solution {
    public String addBinary(String a, String b) {

        if (a.length() >= b.length()) {
            return process(a, b);
        }
        return process(b, a);
    }

    private String process(String large, String small) {
        boolean carry = false;
        StringBuilder builder = new StringBuilder();
        int smallLength = small.length() - 1;
        int largeLength = large.length() - 1;
        for (int i = 0; i < small.length(); i++) {
            if (carry) {
                if (small.charAt(smallLength-i) == '1' && large.charAt(largeLength-i) == '1') {
                    builder.append(1);
                } else if (small.charAt(smallLength-i) == '0' && large.charAt(largeLength-i) == '0') {
                    builder.append(1);
                    carry = false;
                } else {
                    builder.append(0);
                }
            }else {
                if (small.charAt(smallLength-i) == '1' && large.charAt(largeLength-i) == '1') {
                    builder.append(0);
                    carry = true;
                } else if (small.charAt(smallLength-i) == '0' && large.charAt(largeLength-i) == '0') {
                    builder.append(0);
                } else {
                    builder.append(1);
                }
            }
        }

        for (int i = large.length() - (small.length() + 1); i >= 0; i--) {
            if (carry) {
                if (large.charAt(i) == '1') {
                    builder.append(0);
                    carry = true;
                } else {
                    builder.append(1);
                    carry = false;
                }
            } else {
                if (large.charAt(i) == '1') {
                    builder.append(1);
                } else {
                    builder.append(0);
                }
            }
        }
        if (carry) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }
}