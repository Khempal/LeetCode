package com.leetcode.problem_1_to_100.problem14;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < strs[i].length(); j++) {
                try {
                    if (prefix.charAt(j) == strs[i].charAt(j)) {
                        builder.append(prefix.charAt(j));
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            prefix = builder.toString();
        }
        return prefix;
    }
}