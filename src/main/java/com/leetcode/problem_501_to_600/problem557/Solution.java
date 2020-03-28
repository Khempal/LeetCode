package com.leetcode.problem_501_to_600.problem557;

class Solution {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                reverse.append(word).append(" ");
                word.setLength(0);
            } else {
                word.insert(0, s.charAt(i));
            }
        }
        reverse.append(word);
        return reverse.toString();
    }
}