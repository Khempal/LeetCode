package com.leetcode.problem_801_to_900.problem844;

class Solution {
    public static boolean backspaceCompare(String s, String t) {

        char[] first = s.toCharArray();
        int firstLength = processCharArray(first);

        char[] second = t.toCharArray();
        int secondLength = processCharArray(second);
        if (firstLength != secondLength) {
            return false;
        }

        for (int i = 0; i < firstLength; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    private static int processCharArray(char[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '#') {
                if (index > 0) {
                    index--;
                }
            } else {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}