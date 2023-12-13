package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(), next = head;
        ListNode l1 = list1, l2 = list2;
        do {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    next.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    next.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                next = next.next;
            }
        } while (l1 != null && l2 != null);
        ListNode l1Remaining = l1;
        while (l1Remaining != null) {
            next.next = new ListNode(l1.val);
            l1Remaining = l1.next;
        }
        ListNode l2Remaining = l2;
        while (l2Remaining != null) {
            next.next = new ListNode(l2.val);
            l2Remaining = l2.next;
        }
        return head.next;
    }

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
