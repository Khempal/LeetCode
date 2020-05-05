package com.leetcode.problem_1_to_100.problem1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /*public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }

        AtomicInteger firstPos = new AtomicInteger(-1);
        AtomicInteger secondPos = new AtomicInteger(-1);
        integerMap.entrySet().forEach(entry -> {
            Integer counterPart = integerMap.get(target - entry.getKey());
            if (Objects.nonNull(counterPart)) {
                firstPos.set(entry.getValue());
                secondPos.set(counterPart);
                return;
            }
        });

        if (firstPos.get() < secondPos.get()) {
            return new int[]{firstPos.get(), secondPos.get()};
        }
        return new int[]{secondPos.get(), firstPos.get()};
    }*/

    /*public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }*/

    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2){
            return null;
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                int j = target - nums[i];
                if(map.containsKey(j)){
                    return new int[] {map.get(j), i};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
