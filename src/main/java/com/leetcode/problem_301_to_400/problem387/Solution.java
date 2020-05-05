package com.leetcode.problem_301_to_400.problem387;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> uniqueMap = new LinkedHashMap<>();
        Set<Character> dupSet = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!dupSet.contains(c)){
                if(uniqueMap.containsKey(c)){
                    uniqueMap.remove(c);
                    dupSet.add(c);
                    // System.out.println("deleting unique : "+c);
                }else{
                    uniqueMap.put(c,i);
                    // System.out.println("ADDing unique : "+c+" , "+i);
                }
            }
            // System.out.println(uniqueMap);
        }
        
        if(uniqueMap.isEmpty()){
            return -1;
        }else{
            return uniqueMap.entrySet().iterator().next().getValue();
        }
    }
}