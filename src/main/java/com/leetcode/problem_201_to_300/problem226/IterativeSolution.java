package com.leetcode.problem_201_to_300.problem226;

import java.util.LinkedList;
import java.util.Queue;

public class IterativeSolution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            swapChildNodes(node);
            if (node.left != null) {
                nodeQueue.offer(node.left);
            }
            if (node.right != null) {
                nodeQueue.offer(node.right);
            }
        }

        return root;
    }

    private void swapChildNodes(TreeNode node) {
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
    }
}
