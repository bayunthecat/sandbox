package com.mine.leet.ace75.heap;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.PriorityQueue;

@ApplicationScoped
public class KthLargest {

	public int kthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			queue.add(nums[i]);
			if (queue.size() > k) {
				queue.remove();
			}
		}
		return queue.peek();
	}
}
