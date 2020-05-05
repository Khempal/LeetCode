package com.leetcode.problem_1301_to_1400.problem1346;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int zeroCount =  0;
        for(int i: arr){
            if(i==0)
                zeroCount++;
            set.add(i);
        }
        
        // System.out.println(set);
        for(int i: arr){
            // System.out.println(i);
            if(i==0 && zeroCount<2)
                continue;
            if(set.contains(i*2)){
                return true;
            }
            if(i%2==0 && set.contains(i/2)){
                return true;
            }
        }
        
        return false;
        
    }
}