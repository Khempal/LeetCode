package com.leetcode.problem_1_to_100.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = line;
            line = in.readLine();
            int numRows = Integer.parseInt(line);

            String ret = new Solution().convertByCondition(s, numRows);

            String out = (ret);

            System.out.print(out);
        }
    }
}