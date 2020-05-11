package com.leetcode.problem_701_to_800.problem733;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];

        if (newColor != oldColor) {
            fillColor(image, sr, sc, oldColor, newColor);
        }

        return image;
    }

    private void fillColor(int[][] image, int sr, int sc, int oldColor, int newColor) {

        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] != oldColor) {
            return;
        }

        image[sr][sc] = newColor;
        fillColor(image, sr + 1, sc, oldColor, newColor);
        fillColor(image, sr - 1, sc, oldColor, newColor);
        fillColor(image, sr, sc - 1, oldColor, newColor);
        fillColor(image, sr, sc + 1, oldColor, newColor);
    }
}