package com.leetcode.problem_1_to_100.problem54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int length = matrix.length;
        int width = matrix[0].length;
        int size = length * width;
        int topBoundary = 0;
        int rightBoundary = width;
        int leftBoundary = -1;
        int bottomBoundary = length;
        char direction = 'R';
        int iIndex = 0;
        int jIndex = 0;

        for (int i = 0; i < size; i++) {
            result.add(matrix[iIndex][jIndex]);
            switch (direction) {
                case 'R':
                    if (jIndex + 1 == rightBoundary) {
                        direction = 'D';
                        iIndex++;
                        rightBoundary--;
                    } else {
                        jIndex++;
                    }
                    break;
                case 'L':
                    if (jIndex - 1 == leftBoundary) {
                        direction = 'U';
                        iIndex--;
                        leftBoundary++;
                    } else {
                        jIndex--;
                    }
                    break;
                case 'U':
                    if (iIndex - 1 == topBoundary) {
                        direction = 'R';
                        jIndex++;
                        topBoundary++;
                    } else {
                        iIndex--;
                    }
                    break;
                case 'D':
                    if (iIndex + 1 == bottomBoundary) {
                        direction = 'L';
                        jIndex--;
                        bottomBoundary--;
                    } else {
                        iIndex++;
                    }
                    break;
            }
        }

        return result;
    }
}