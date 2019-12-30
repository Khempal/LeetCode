package com.leetcode.problem_401_to_500.problem498;

public class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        int size = maxRow * maxCol;
        int curRow = 0;
        int curCol = 0;
        boolean toRight = true;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = matrix[curRow][curCol];

            if (toRight) {
                if (curCol == maxCol - 1) {
                    curRow++;
                    toRight = false;
                } else if (curRow == 0) {
                    curCol++;
                    toRight = false;
                } else {
                    curRow--;
                    curCol++;
                }
            } else {
                if (curRow == maxRow - 1) {
                    curCol++;
                    toRight = true;
                } else if (curCol == 0) {
                    curRow++;
                    toRight = true;
                } else {
                    curRow++;
                    curCol--;
                }
            }
        }
        return result;
    }
}
