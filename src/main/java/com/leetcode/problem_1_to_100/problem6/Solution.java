package com.leetcode.problem_1_to_100.problem6;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder();
        }

        boolean goingForward = false;
        int directionIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            // Checking for first and last condition for builders
            if (directionIndex % numRows == 0 || directionIndex % numRows == numRows - 1) {
                goingForward = !goingForward;
            }
            if (goingForward) {
                builders[directionIndex].append(s.charAt(i));
                directionIndex++;
            } else {
                builders[directionIndex].append(s.charAt(i));
                directionIndex--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(builders[i]);
        }
        return result.toString();
    }

    // Convert row by row
    public String convertByCondition(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder result = new StringBuilder();

        int cycle = 2 * numRows - 2;
        // iterating over rows
        for (int i = 0; i < numRows; i++) {
            // jumping directly to next character in the row
            for (int j = 0; j + i < s.length(); j += cycle) {
                result.append(s.charAt(j + i));
                // if row is not the 1st or last
                // then check for intermediate elements
                if (i != 0 && i != numRows - 1 && j + cycle - i < s.length()) {
                    result.append(s.charAt(j + cycle - i));
                }
            }
        }

        return result.toString();
    }
}