package com.leetcode.problem_501_to_600.problem525;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        // find abs difference from 0
        /*int result = nums[0] == 0 ? -1 : 1;
        int abs = 0, size = 0, curSize = 0;
        for (int i = 1; i < nums.length; i++) {
            abs = Math.abs(result);
            if (nums[i] == 0) {
                result--;
            } else {
                result++;
            }
            if (Math.abs(result) < abs) {
                curSize += 2;
            }
            if (Math.abs(result) == 0) {
                size += curSize;
                curSize = 0;
            }
        }
        return Math.max(size, curSize);*/

        int size = 0;
        Map<Integer, Integer> firstSumMap = new HashMap<>();
        firstSumMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            if (firstSumMap.containsKey(sum)) {
                size = Math.max(size, i - firstSumMap.get(sum));
            } else {
                firstSumMap.put(sum, i);
            }
        }
        return size;
    }
}
