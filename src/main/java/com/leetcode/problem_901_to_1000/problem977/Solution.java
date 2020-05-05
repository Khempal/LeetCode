package com.leetcode.problem_901_to_1000.problem977;

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        int fillIndex = A.length - 1;

        while (left <= right) {

            if (Math.abs(A[left]) >= Math.abs(A[right])) {
                result[fillIndex] = A[left] * A[left];
                left++;
            } else if (Math.abs(A[right]) > Math.abs(A[left])) {
                result[fillIndex] = A[right] * A[right];
                right--;
            }
            fillIndex--;
        }

        return result;
    }
}