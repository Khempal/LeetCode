package com.leetcode.problem_1_to_100.problem4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] sorted = new int[totalLength];
        int sortedIndex = 0, arrOneIndex = 0, arrTwoIndex = 0;

        while (arrOneIndex < nums1.length || arrTwoIndex < nums2.length) {
            if (arrOneIndex == nums1.length) {
                while (arrTwoIndex < nums2.length) {
                    sorted[sortedIndex] = nums2[arrTwoIndex];
                    sortedIndex++;
                    arrTwoIndex++;
                }
            } else if (arrTwoIndex == nums2.length) {
                while (arrOneIndex < nums1.length) {
                    sorted[sortedIndex] = nums1[arrOneIndex];
                    sortedIndex++;
                    arrOneIndex++;
                }
            } else {
                if (nums1[arrOneIndex] <= nums2[arrTwoIndex]) {
                    sorted[sortedIndex] = nums1[arrOneIndex];
                    arrOneIndex++;
                } else {
                    sorted[sortedIndex] = nums2[arrTwoIndex];
                    arrTwoIndex++;
                }
                sortedIndex++;
            }
        }
        //[1,2,3,4,5,6]
        if (totalLength % 2 == 1) {
            return sorted[totalLength / 2];
        } else {
            int mid = totalLength / 2;
            return (sorted[mid - 1] + sorted[mid]) / 2D;
        }
    }
}