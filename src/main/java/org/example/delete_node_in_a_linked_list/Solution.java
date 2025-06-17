package org.example.delete_node_in_a_linked_list;

import org.example.data_structures.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        ListNode nn = node.next;
        node.val = nn.val;
        node.next = nn.next;
        nn.next = null;
    }
}
