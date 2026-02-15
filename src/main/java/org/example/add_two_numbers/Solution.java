package org.example.add_two_numbers;

import org.example.data_structures.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode th = h;
        int cin = 0;
        while (l1.next != null && l2.next != null) {
            int s = l1.val + l2.val + cin;
            th.val = s % 10;
            cin = s / 10;
            l1 = l1.next;
            l2 = l2.next;
            ListNode nn = new ListNode(0);
            th.next = nn;
            th = nn;
        }

        while (l1 != null && l2 != null) {
            int s = l1.val + l2.val + cin;
            int d = s % 10;
            th.val = d;
            cin = s / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            th.next = new ListNode(0);
            th = th.next;
            int s = l1.val + cin;
            int d = s % 10;
            th.val = d;
            cin = s / 10;
            l1 = l1.next;
        }

        while (l2 != null) {
            th.next = new ListNode(0);
            th = th.next;
            int s = l2.val + cin;
            int d = s % 10;
            th.val = d;
            cin = s / 10;
            l2 = l2.next;
        }

        if (cin > 0) {
            th.next = new ListNode(cin);
        }

        return h;
    }
}
