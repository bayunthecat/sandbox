package com.mine.practice.fundamentals;

import com.mine.util.TreeNode;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BreadthFirstSearchTest {

	BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

	@Test
	void test_1() {
		TreeNode<String> tree = buildTree();
		final var result = breadthFirstSearch.bfs(tree);
		assertThat(result).containsExactly("R", "L1", "R1", "L1L2", "L1R2", "R1L2", "R1R2");
	}

	private TreeNode<String> buildTree() {
		TreeNode<String> root = new TreeNode<>("R");
		root.setLeft(new TreeNode<>("L1", new TreeNode<>("L1L2"), new TreeNode<>("L1R2")));
		root.setRight(new TreeNode<>("R1", new TreeNode<>("R1L2"), new TreeNode<>("R1R2")));
		return root;
	}

}