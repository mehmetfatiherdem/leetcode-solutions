package org.example.reorder_list;

import org.example.data_structures.ListNode;

public class Solution {

    public void reorderList(ListNode head) {
        if(head.next == null) return;

        ListNode s = head, f = head;
        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        ListNode sec = s.next;
        s.next = null;
        ListNode node = null;

        while(sec != null) {
            ListNode t = sec.next;
            sec.next = node;
            node = sec;
            sec = t;
        }

        ListNode fi = head;
        sec = node;

        while(sec != null) {
            if(fi != null) {
                ListNode t1 = fi.next, t2 = sec.next;
                fi.next = sec;
                sec.next = t1;
                fi = t1;
                sec = t2;
            }

        }

    }
}
