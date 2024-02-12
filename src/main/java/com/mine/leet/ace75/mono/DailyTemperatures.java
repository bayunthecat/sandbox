package com.mine.leet.ace75.mono;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayDeque;
import java.util.Deque;

@ApplicationScoped
public class DailyTemperatures {

	public int[] dailyTemperatures(int[] temperatures) {
		int[] result = new int[temperatures.length];
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < temperatures.length; i++) {
			while (!deque.isEmpty() && temperatures[deque.peek()] < temperatures[i]) {
				int index = deque.pop();
				result[index] = i - index;
			}
			deque.push(i);
		}
		return result;
	}
}
