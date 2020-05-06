package com.leetcode.problem_901_to_1000.problem905;

class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int evenLoc = 0;
        int oddLoc = arr.length - 1;

        while (evenLoc < oddLoc) {
            // forward even location
            while (evenLoc < arr.length && arr[evenLoc] % 2 == 0) {
                evenLoc++;
            }

            //Backward odd location
            while (oddLoc >= 0 && arr[oddLoc] % 2 == 1) {
                oddLoc--;
            }

            if (evenLoc < oddLoc) {
                int temp = arr[evenLoc];
                arr[evenLoc] = arr[oddLoc];
                arr[oddLoc] = temp;
            }

        }

        return arr;
    }
}