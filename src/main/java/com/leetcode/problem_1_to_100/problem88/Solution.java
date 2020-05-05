package com.leetcode.problem_1_to_100.problem88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fillIndex = nums1.length - 1;
        m = m-1;
        n = n-1;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[fillIndex] = nums1[m];
                m--;
            }else{
                nums1[fillIndex] = nums2[n];
                n--;
            }
            fillIndex--;
        }
        // If items in nums1 are present then no need to adjust
        
        
        // If items in nums2 are remaining then add them to nums1
        if(n>=0){
            for(int i=n; i>=0; i--){
                nums1[fillIndex] = nums2[n];
                n--;
                fillIndex--;
            }
        }
        
    }
}