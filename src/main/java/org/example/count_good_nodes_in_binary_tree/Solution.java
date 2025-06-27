package org.example.count_good_nodes_in_binary_tree;

import org.example.data_structures.TreeNode;

public class Solution {
    public int goodNodes(TreeNode root) {
        int[] ar = {0};

        cnt(root.left, root.val, ar);
        cnt(root.right, root.val, ar);

        return ar[0]+1;
    }

    public void cnt(TreeNode root, int max, int[] cn) {
        if(root == null) return;

        if(root.val>=max) {
            max = root.val;
            cn[0]++;
        }

        cnt(root.left, max, cn);
        cnt(root.right, max, cn);
    }
}