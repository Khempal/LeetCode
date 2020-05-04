package com.leetcode.problem_401_to_500.problem476;

class Solution {
    public int findComplement(int num) {
        int size = findBitSize(num);
        int max = getMaxNumberNumberBySize(size);

        return num ^ max;
    }

    private int findBitSize(int num) {
        int size = 0;
        while (num > 0) {
            num = num >> 1;
            size++;
        }
        return size;
    }

    private int getMaxNumberNumberBySize(int size) {
        int max = 1;
        for (int i = 1; i < size; i++) {
            max = max << 1 | 1;
        }
        return max;
    }
}