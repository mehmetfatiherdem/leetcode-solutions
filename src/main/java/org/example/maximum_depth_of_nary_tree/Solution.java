package org.example.maximum_depth_of_nary_tree;

import java.util.List;

public class Solution {
    class Node {
        public int val;
        public List<Node> children;

    }
    public int maxDepth(Node root) {
        if(root == null) return 0;
        if(root.children.isEmpty()) return 1;
        int max = Integer.MIN_VALUE;
        for(Node n: root.children) {
            int len = maxDepth(n);
            max = Math.max(max, len+1);
        }

        return max;
    }
}
