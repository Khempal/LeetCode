package com.leetcode.problem_101_to_200.problem169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            int freq = 0;
            if (freqMap.containsKey(num)) {
                freq = freqMap.get(num);
            }
            freq += 1;
            if (freq > nums.length / 2) {
                return num;
            }
            freqMap.put(num, freq);
        }
        return 0;
    }
}