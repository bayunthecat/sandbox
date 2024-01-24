package com.mine.leet.ace75.linkedlist;

import com.mine.util.ListNode;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ReverseLinkedListTest {

	@Inject
	ReverseLinkedList reverseLinkedList;

	@Test
	void test_1() {
		final var result = reverseLinkedList.reverseList(input(new int[]{1, 2, 3, 4, 5}));
		assertThat(output(result)).containsExactly(5, 4, 3, 2, 1);
	}

	private int[] output(ListNode node) {
		List<Integer> list = new ArrayList<>();
		while (node != null) {
			list.add(node.val);
			node = node.next;
		}
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	private ListNode input(int[] array) {
		ListNode dummyHead = new ListNode();
		ListNode current = dummyHead;
		for (int j : array) {
			current.next = new ListNode(j);
			current = current.next;
		}
		return dummyHead.next;
	}
}