package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.*;

@ApplicationScoped
public class GraphBreadthAdjacency {

	public List<Integer> bfs(int[][] adjacency, int source, int search) {
		boolean[] seen = new boolean[adjacency.length];
		int[] prev = new int[adjacency.length];
		Arrays.fill(prev, -1);
		seen[source] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		do {
			int curr = queue.poll();
			if (curr == search) {
				break;
			}
			for (int i = 0; i < adjacency[curr].length; i++) {
				if (adjacency[curr][i] == 0) {
					continue;
				}
				if (seen[i]) {
					continue;
				}
				seen[i] = true;
				prev[i] = curr;
				queue.offer(i);
			}
		} while (queue.size() != 0);
		int curr = search;
		List<Integer> path = new ArrayList<>();
		while (prev[curr] != -1) {
			path.add(curr);
			curr = prev[curr];
		}
		path.add(source);
		Collections.reverse(path);
		return path;
	}
}
