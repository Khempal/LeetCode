package com.leetcode.problem_101_to_200.problem118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows >= 1) {
            List<Integer> first = new ArrayList<>();
            first.add(1);
            pascal.add(first);
        }
        if (numRows >= 2) {
            List<Integer> second = new ArrayList<>();
            second.add(1);
            second.add(1);
            pascal.add(second);
        }
        if (numRows > 2) {
            for (int i = 2; i < numRows; i++) {
                List<Integer> newRow = new ArrayList<>();
                List<Integer> topRow = pascal.get(i - 1);
                newRow.add(1);
                for (int j = 1; j < topRow.size(); j++) {
                    newRow.add(topRow.get(j-1)+topRow.get(j));
                }
                newRow.add(1);
                pascal.add(newRow);
            }
        }
        return pascal;
    }
}