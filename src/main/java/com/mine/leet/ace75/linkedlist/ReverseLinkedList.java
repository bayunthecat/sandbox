package com.mine.leet.ace75.linkedlist;

import com.mine.leet.util.ListNode;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
}
