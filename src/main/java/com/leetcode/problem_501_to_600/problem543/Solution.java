package com.leetcode.problem_501_to_600.problem543;

class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        processTree(root);
        return max;
    }

    public int processTree(TreeNode root){
        //Base Condition
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right == null){
            return 1;
        }
        // we have node below
        int left = processTree(root.left);
        int right = processTree(root.right);
        max = Math.max(max, left+right);
        return Math.max(left,right)+1;
    }
}