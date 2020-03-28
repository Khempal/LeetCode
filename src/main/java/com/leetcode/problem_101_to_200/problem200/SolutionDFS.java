package com.leetcode.problem_101_to_200.problem200;

class SolutionDFS {
    public int numIslands(char[][] grid) {
        int count = 0;

        int rows = grid.length;
        if (rows == 0)
            return count;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j, rows, cols);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j, rows, cols);
        dfs(grid, i - 1, j, rows, cols);
        dfs(grid, i, j + 1, rows, cols);
        dfs(grid, i, j - 1, rows, cols);
    }

}