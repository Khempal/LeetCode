package com.leetcode.problem_101_to_200.problem200;

class SolutionBFS {
    public int numIslands(char[][] grid) {
        int count = 0;

        int rows = grid.length;
        if (rows == 0)
            return count;
        int cols = grid[0].length;

        boolean[][] isVisited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!isVisited[i][j] && grid[i][j] == '1') {
                    count++;
                    bfs(grid, isVisited, i, j, rows, cols);
                }
            }
        }

        return count;
    }

    private void bfs(char[][] grid, boolean[][] isVisited, int i, int j, int rows, int cols) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || isVisited[i][j] || grid[i][j] == '0') {
            return;
        }

        isVisited[i][j] = true;
        bfs(grid, isVisited, i + 1, j, rows, cols);
        bfs(grid, isVisited, i - 1, j, rows, cols);
        bfs(grid, isVisited, i, j + 1, rows, cols);
        bfs(grid, isVisited, i, j - 1, rows, cols);
    }

}