package com.leetcode.problem_1_to_100.problem3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int front = 0, back = 0, max = 0;
        Set<Character> charSet = new HashSet<>();
        while (front < arr.length) {
            // if curent character is not  present in set
            // then increase front pointer
            // and calculate max
            if (!charSet.contains(arr[front])) {
                max = Math.max(front - back + 1, max);
                charSet.add(arr[front++]);
            } else {
                charSet.remove(arr[back++]);
            }
        }
        return max;
    }

    /*public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int front = 0;
        int back = 0;
        int max = 0;
//        Set<Character> charSet = new HashSet();
        byte[] charSet = new byte[26];
        while (front < arr.length) {
            // if curent character is not  present in set
            // then increase front pointer
            // and calculate max

            if (charSet[arr[front] - 'a'] == 0) {
                max = Math.max(front - back + 1, max);
                charSet[arr[front++]  - 'a'] = 1;
            } else {
                charSet[arr[back++]  - 'a'] = 0;
            }
        }
        return max;
    }*/
}