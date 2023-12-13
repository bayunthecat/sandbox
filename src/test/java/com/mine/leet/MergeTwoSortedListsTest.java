package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MergeTwoSortedListsTest {

    @Inject
    MergeTwoSortedLists subject;

    @Test
    void test_1() {
        final var result = subject.mergeTwoLists(list(new int[]{1, 2, 4}), list(new int[]{1, 3, 4}));
        final var resultArray = array(result);
        assertThat(resultArray).containsExactly(1, 1, 2, 3, 4, 4);
    }

    @Test
    void test_2() {
        final var result = subject.mergeTwoLists(list(new int[]{}), list(new int[]{0}));
        final var resultArray = array(result);
        assertThat(resultArray).containsExactly(0);
    }

    @Test
    void test_3() {
        final var result = subject.mergeTwoLists(list(new int[]{}), list(new int[]{1}));
        final var resultArray = array(result);
        assertThat(resultArray).containsExactly(1);
    }

    @Test
    void test_4() {
        final var result = subject.mergeTwoLists(list(new int[]{1}), list(new int[]{}));
        final var resultArray = array(result);
        assertThat(resultArray).containsExactly(1);
    }

    @Test
    void test_5() {
        final var result = subject.mergeTwoLists(list(new int[]{}), list(new int[]{}));
        final var resultArray = array(result);
        assertThat(resultArray).containsExactly();
    }

    private int[] array(MergeTwoSortedLists.ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    private MergeTwoSortedLists.ListNode list(int[] array) {
        MergeTwoSortedLists.ListNode head = new MergeTwoSortedLists.ListNode(), next = head;
        for (int i : array) {
            next.next = new MergeTwoSortedLists.ListNode(i);
            next = next.next;
        }
        return head.next;
    }
}