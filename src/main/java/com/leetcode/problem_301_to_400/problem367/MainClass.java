package com.leetcode.problem_301_to_400.problem367;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);

            boolean ret = new Solution().isPerfectSquare(num);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}