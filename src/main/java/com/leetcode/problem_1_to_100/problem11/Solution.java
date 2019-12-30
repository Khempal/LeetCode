package com.leetcode.problem_1_to_100.problem11;

class Solution {
    //Brute Force
    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return maxArea;
    }

    //Two Pointer
    public int maxArea(int[] height) {
        int maxArea = 0, low = 0, high = height.length - 1;
        while (low < high) {
            int currArea = (high - low) * Math.min(height[low], height[high]);
            maxArea = Math.max(maxArea, currArea);
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }
}