package com.leetcode.problem_1001_to_1100.problem1046;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        //Generate Priority Queue
        Queue<Integer> queue = generatePriorityQueue(stones);
        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            if (first != second) {
                queue.offer(first - second);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

    private PriorityQueue<Integer> generatePriorityQueue(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());
        for (int stone : stones) {
            queue.offer(stone);
        }
        return queue;
    }
}