package org.example.maximum_depth_of_nary_tree;

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
    public int maxDepth(Node root) {
        if(root == null) return 0;
        if(root.children.size() == 0) return 1;
        int max = Integer.MIN_VALUE;
        for(Node n: root.children) {
            int len = maxDepth(n);
            max = Math.max(max, len+1);
        }

        return max;
    }
}
