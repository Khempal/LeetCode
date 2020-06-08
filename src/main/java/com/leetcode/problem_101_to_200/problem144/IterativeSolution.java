package com.leetcode.problem_101_to_200.problem144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class IterativeSolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> preOrderList = new ArrayList<>();
        if (root == null) {
            return preOrderList;
        }
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            preOrderList.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return preOrderList;
    }
}