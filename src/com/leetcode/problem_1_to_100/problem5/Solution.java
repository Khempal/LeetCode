package com.leetcode.problem_1_to_100.problem5;

class Solution {

    //Brute Force
    public String longestPalindrome(String s) {
        String largest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    if (j - i + 1 > largest.length()) {
                        largest = s.substring(i, j + 1);
                    }
                }
            }
        }
        return largest;
    }

    //Helper method in finding palindrome using Brute Force
    private boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    //Dynamic Programming
    public String longestPalindromeDP(String s) {
        String largest = "";
        byte[][] palinStatusArr = new byte[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            palinStatusArr[i][i] = 1;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindromeDP(s, i, j, palinStatusArr)) {
                    if (j - i + 1 > largest.length()) {
                        largest = s.substring(i, j + 1);
                    }
                }
            }
        }
        return largest;
    }

    //Helper method in finding palindrome using Dynamic Programming
    private boolean isPalindromeDP(String s, int i, int j, byte[][] palinArr) {
        //base case
        // if length is 0 or 1
        if (j - i <= 1) {
            if (s.charAt(i) == s.charAt(j)) {
                palinArr[i][j] = 1;
                return true;
            } else {
                palinArr[i][j] = -1;
                return false;
            }
        }

        // if length is more than 2,
        // we can use computed results
        if (s.charAt(i) != s.charAt(j)) {
            palinArr[i][j] = -1;
            return false;
        } else {
            if (palinArr[i + 1][j - 1] == 1) {
                palinArr[i][j] = 1;
                return true;
            } else if (palinArr[i + 1][j - 1] == -1) {
                palinArr[i][j] = -11;
                return false;
            } else {
                if (isPalindromeDP(s, i + 1, j - 1, palinArr)) {
                    palinArr[i][j] = 1;
                    return true;
                } else {
                    palinArr[i][j] = -1;
                    return false;
                }
            }
        }
    }

    //Two Pointer approach from center
    public String longestPalindromeTwoPointer(String s) {
        if (s.length() < 2) {
            return s;
        }
        int low = 0, high = 0;
        for (int i = 0; i < s.length(); i++) {
            Pair pair = expander(s, i, i);
            Pair pair1 = expander(s, i, i + 1);
            if (pair.higher - pair.lower > pair1.higher - pair1.lower) {
                if (high - low < pair.higher - pair.lower) {
                    high = pair.higher;
                    low = pair.lower;
                }
            } else {
                if (high - low < pair1.higher - pair1.lower) {
                    high = pair1.higher;
                    low = pair1.lower;
                }
            }
        }
        return s.substring(low, high + 1);
    }

    // Helper method for finding max length of palindrome from this center
    private Pair expander(String s, int i, int j) {
        Pair pair = new Pair();
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            pair.lower = i;
            pair.higher = j;
            i--;
            j++;
        }

        return pair;
    }

    private static class Pair {
        int lower;
        int higher;
    }
}