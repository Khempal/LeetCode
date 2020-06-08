package com.leetcode.problem_201_to_300.problem226;

class RecursiveSolution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.right =  invertTree(left);
        root.left = invertTree(right);
        return root;
    }
}