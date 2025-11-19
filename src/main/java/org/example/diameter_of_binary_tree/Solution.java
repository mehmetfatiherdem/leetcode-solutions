package org.example.diameter_of_binary_tree;

import org.example.data_structures.TreeNode;

public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return -1;
        int[]res = {0};

        return res[0];
    }
    int d(TreeNode root, int[]res) {
        if(root == null) return 0;

        int lh = d(root.left, res);
        int rh = d(root.right, res);
        res[0] = Math.max(res[0],lh+rh);
        return Math.max(lh,rh)+1;
    }
}
