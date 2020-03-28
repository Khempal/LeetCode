package com.leetcode.problem_101_to_200.problem151;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder reverse = new StringBuilder();
        StringBuilder word = new StringBuilder();
        char lastChar = '\0';
        for (int i = s.length() - 1; i >= 0; i--) {
            char currChar = s.charAt(i);
            if (currChar == ' ') {
                if (lastChar == ' ') {
                    continue;
                }
                reverse.append(word).append(" ");
                word.setLength(0);
            } else {
                word.insert(0, currChar);
            }
            lastChar = currChar;
        }
        reverse.append(word);
        return reverse.toString();
    }
}