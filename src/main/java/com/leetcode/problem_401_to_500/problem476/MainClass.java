package com.leetcode.problem_401_to_500.problem476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().findComplement(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}