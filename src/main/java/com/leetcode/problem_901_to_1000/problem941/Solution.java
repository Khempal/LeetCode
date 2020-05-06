package com.leetcode.problem_901_to_1000.problem941;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int prev = arr[0];
        boolean isMovingUp = true;

        if (prev > arr[1])
            return false;

        for (int i = 1; i < arr.length; i++) {
            if (isMovingUp) {
                if (prev == arr[i]) {
                    return false;
                } else if (prev > arr[i]) {
                    isMovingUp = false;
                }
                prev = arr[i];
            } else {
                if (prev == arr[i] || prev < arr[i]) {
                    return false;
                }
                prev = arr[i];
            }
        }
        return !isMovingUp;
    }
}