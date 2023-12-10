package com.mine.lectures.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {

	private Tree<Integer> tree;

	@BeforeEach
	void init() {
		tree = new Tree<>();
	}

	@Test
	void testInsert() {
		tree.insert(5);
		tree.insert(4);
		tree.insert(6);
		tree.insert(8);
	}

}