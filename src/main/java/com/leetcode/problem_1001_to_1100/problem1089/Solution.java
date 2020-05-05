package com.leetcode.problem_1001_to_1100.problem1089;

class Solution {
    public void duplicateZeros(int[] arr) {
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0){
                i++;
                moveElements(arr,i);
                arr[i] = 0;
            }
        }
        
    }
    
    private void moveElements(int[] arr, int left){
        for(int i=arr.length-1; i>left; i--){
            arr[i] = arr[i-1];
        }
    }
}