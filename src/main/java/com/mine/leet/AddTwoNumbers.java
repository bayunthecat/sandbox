package com.mine.leet;

import com.mine.leet.util.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(), current = result;
        int val1, val2, carry = 0;
        while (l1 != null || l2 != null) {
            val1 = l1 == null ? 0 : l1.val;
            val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry = sum / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        return result.next;
    }
}
