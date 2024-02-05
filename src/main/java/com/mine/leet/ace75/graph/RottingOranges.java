package com.mine.leet.ace75.graph;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@ApplicationScoped
public class RottingOranges {

	public int orangesRotting(int[][] grid) {
		if (grid.length == 0) {
			return -1;
		}
		int oranges = 0, xLength = grid.length, yLength = grid[0].length;
		Queue<Point> queue = new LinkedList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 2) {
					queue.offer(new Point(i, j));
					oranges++;
				} else if (grid[i][j] == 1) {
					oranges++;
				}
			}
		}
		if (queue.size() == 0) {
			return oranges == 0 ? 0 : -1;
		}
		int minutes = -1;
		Set<Point> seen = new HashSet<>();
		while (queue.size() != 0 && oranges != 0) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				Point p = queue.poll();
				if (p == null) {
					continue;
				}
				if (p.x < 0 || p.x >= xLength || p.y < 0 || p.y >= yLength) {
					continue;
				}
				if (seen.contains(p)) {
					continue;
				}
				seen.add(p);
				if (grid[p.x][p.y] == 2 || grid[p.x][p.y] == 1) {
					grid[p.x][p.y] = 2;
					oranges--;
					queue.offer(new Point(p.x + 1, p.y));// right
					queue.offer(new Point(p.x - 1, p.y));// left
					queue.offer(new Point(p.x, p.y + 1));// up
					queue.offer(new Point(p.x, p.y - 1));// down
				}
			}
			minutes++;
		}
		return oranges != 0 ? -1 : minutes;
	}

	private static class Point {

		public int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("(x: %s, y: %s)", x, y);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof Point another)) {
				return false;
			}
			return x == another.x && y == another.y;
		}

		@Override
		public int hashCode() {
			int prime = 31;
			return prime * x + prime * y;
		}
	}
}
