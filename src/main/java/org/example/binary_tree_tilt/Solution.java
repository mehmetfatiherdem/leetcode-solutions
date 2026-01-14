package org.example.binary_tree_tilt;

import org.example.data_structures.TreeNode;

public class Solution {
    int res = 0;

    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        f(root);
        return res;
    }

    int f(TreeNode root) {
        if(root == null) return 0;

        int lsum = f(root.left);
        int rsum = f(root.right);
        res += Math.abs(lsum - rsum);
        return root.val+lsum+rsum;
    }
}
