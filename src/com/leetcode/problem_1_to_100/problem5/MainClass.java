package com.leetcode.problem_1_to_100.problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            long start = System.nanoTime();
            String ret = new Solution().longestPalindromeTwoPointer(line);
            String out = (ret);
            System.out.println(out);
            System.out.println(System.nanoTime() - start);
        }
    }
}