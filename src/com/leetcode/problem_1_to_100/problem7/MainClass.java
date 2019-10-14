package com.leetcode.problem_1_to_100.problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = new Solution().reverseInt(x);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}