package com.mine.leet.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    private AddTwoNumbers subject = new AddTwoNumbers();

    @Test
    void test_1() {
        ListNode number = number(3, 2, 1);
        ListNode result = subject.addTwoNumbers(number, number(3, 2, 1));
        int actual = convert(result);
        assertEquals(246, actual);
    }

    @Test
    void test_2() {
        ListNode number = number(3, 2, 9);
        ListNode result = subject.addTwoNumbers(number, number(3, 2, 9));
        int actual = convert(result);
        assertEquals(1846, actual);
    }

    private int convert(ListNode node) {
        int result = 0, multiplier = 1;
        while (node != null) {
            result += node.val * multiplier;
            multiplier *= 10;
            node = node.next;
        }
        return result;
    }

    private ListNode number(int... numbers) {
        ListNode head = new ListNode(), current = head;
        for (int number : numbers) {
            current.val = number;
            current.next = new ListNode(0, null);
            current = current.next;
        }
        return head;
    }
}