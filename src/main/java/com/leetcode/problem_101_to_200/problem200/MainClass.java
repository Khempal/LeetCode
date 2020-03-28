package com.leetcode.problem_101_to_200.problem200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int rows = 4;
        int cols = 5;
        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            line = in.readLine();
            for (int j = 0; j < cols; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        System.out.println(new SolutionDFS().numIslands(grid));
    }
}
