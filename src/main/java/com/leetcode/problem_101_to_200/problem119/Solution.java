package com.leetcode.problem_101_to_200.problem119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Copied Solution
        List<Integer> row = new ArrayList<>();
        long x = 1;
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            x = (x * (rowIndex - i + 1)) / i;
            row.add((int) x);
        }
        return row;
    }
}