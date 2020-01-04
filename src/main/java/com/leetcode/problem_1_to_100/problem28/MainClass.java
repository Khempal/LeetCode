package com.leetcode.problem_1_to_100.problem28;

import com.eclipsesource.json.JsonArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String haystack = stringToString(line);
            line = in.readLine();
            String needle = stringToString(line);

            int ret = new Solution().strStr(haystack, needle);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}