package org.example.maximum_depth_of_nary_tree;

import org.example.data_structures.NaryTree;

public class Solution {
    public int maxDepth(NaryTree root) {
        if(root == null) return 0;
        if(root.children.isEmpty()) return 1;
        int max = Integer.MIN_VALUE;
        for(NaryTree n: root.children) {
            int len = maxDepth(n);
            max = Math.max(max, len+1);
        }

        return max;
    }
}
