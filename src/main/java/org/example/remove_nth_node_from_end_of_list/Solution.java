package org.example.remove_nth_node_from_end_of_list;

import org.example.data_structures.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> li = new ArrayList<>();
        while(head != null) {
            li.add(head);
            head = head.next;
        }

        int i = li.size()-n;
        var curr = li.get(i);
        if(i == 0) return curr.next;
        var prev = li.get(i-1);
        prev.next = curr.next;
        curr.next = null;
        return li.get(0);
    }
}
