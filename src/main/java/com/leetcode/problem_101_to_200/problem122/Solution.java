package com.leetcode.problem_101_to_200.problem122;

class Solution {
    public int maxProfit(int[] prices) {
        int initial = prices[0];
        int prev = prices[0];
        int profit = 0;
        for(int price : prices){
            if(prev < price){
                prev = price;
            }
            if(prev>= price){
                profit = profit + prev - initial;
                prev = price;
                initial  = price;
            }
        }
        return profit;
    }
}