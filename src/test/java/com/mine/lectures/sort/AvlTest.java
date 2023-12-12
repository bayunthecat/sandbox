package com.mine.lectures.sort;

import com.mine.lectures.sort.Avl;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;;

@QuarkusTest
class AvlTest {

	@Inject
	Avl avl;

	@BeforeEach
	void init() {
		avl = new Avl();
	}

	@Test
	void test_left() {
		avl.insert(1);
		avl.insert(2);
		avl.insert(3);
	}

	@Test
	void test_right() {
		avl.insert(3);
		avl.insert(2);
		avl.insert(1);
	}

	@Test
	void test_left_right() {
		avl.insert(1);
		avl.insert(3);
		avl.insert(2);
	}

	@Test
	void test_right_left() {
		avl.insert(1);
		avl.insert(3);
		avl.insert(2);
	}

	@Test
	void testTree() {
		avl.insert(1);
		avl.insert(2);
		avl.insert(3);
		avl.insert(4);
		avl.insert(5);
		avl.insert(6);
	}

}