package org.example.n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> postorder(Node root) {
        List<Integer> li = new ArrayList<>();
        if(root == null) return li;
        po(root, li);
        li.add(root.val);
        return li;
    }

    void po(Node root, List<Integer> li) {
        if(root == null) return;

        for(Node n: root.children) {
            po(n, li);
            li.add(n.val);
        }
    }
}
