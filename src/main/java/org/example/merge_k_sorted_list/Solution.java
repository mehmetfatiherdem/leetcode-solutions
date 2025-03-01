package org.example.merge_k_sorted_list;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    class ListNode {
        ListNode next;
        int val;
    }
    public ListNode mergetwo(ListNode l1, ListNode l2) {
        var l = new ListNode();
        var t = l;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                t.next = l1;
                l1 = l1.next;

            } else {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }
        if(l1 != null) t.next = l1;
        if(l2 != null) t.next = l2;
        return l.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        while(lists.length > 1) {
            List<ListNode> ml = new ArrayList<>();

            for(int i = 0; i<lists.length; i+=2) {
                var l1 = lists[i];
                var l2 = i+1 < lists.length ? lists[i+1] : null;
                ml.add(mergetwo(l1, l2));
            }
            lists = ml.toArray(new ListNode[0]);
        }

        return lists[0];
    }
}
