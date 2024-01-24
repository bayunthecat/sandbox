package com.mine.practice.fundamentals;

import com.mine.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {

	public <T> List<T> bfs(TreeNode<T> node) {
		List<T> result = new ArrayList<>();
		LinkedList<TreeNode<T>> queue = new LinkedList<>();
		queue.push(node);
		while (!queue.isEmpty()) {
			TreeNode<T> deque = queue.remove();
			result.add(deque.getValue());
			if (deque.getLeft() != null)
				queue.add(deque.getLeft());
			if (deque.getRight() != null)
				queue.add(deque.getRight());
		}
		return result;
	}

}
