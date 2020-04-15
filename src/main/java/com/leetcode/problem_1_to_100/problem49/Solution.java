package com.leetcode.problem_1_to_100.problem49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> resultMap = new HashMap();
        for (String word : strs) {
            Map<Character, Integer> charMap = new HashMap();
            for (int i = 0; i < word.length(); i++) {
                char curChar = word.charAt(i);
                int count = charMap.getOrDefault(curChar, 0);
                charMap.put(curChar, count + 1);
            }
            List<String> current = resultMap.getOrDefault(charMap, new ArrayList());
            current.add(word);
            resultMap.put(charMap, current);
        }
        return new ArrayList(resultMap.values());
    }
}