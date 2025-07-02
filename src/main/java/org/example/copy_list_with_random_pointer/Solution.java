package org.example.copy_list_with_random_pointer;

import org.example.data_structures.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Node, Node> hm = new HashMap<>();

        Node h = new Node(head.val);
        Node th = h;
        Node thead = head.next;

        hm.put(head, h);

        while(thead != null) {
            Node nn = new Node(thead.val);
            hm.put(thead, nn);
            th.next = nn;
            th = th.next;
            thead = thead.next;
        }

        th.next = null;

        Node tth = h;
        Node tthead = head;

        while(tthead != null) {
            Node nnn = hm.get(tthead.random);
            tth.random = nnn;
            tth = tth.next;
            tthead = tthead.next;
        }

        return h;
    }
}