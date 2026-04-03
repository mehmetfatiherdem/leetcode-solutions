package org.example.sum_of_left_leaves;

import org.example.data_structures.TreeNode;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }
    public int dfs(TreeNode root, boolean isLeft) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return isLeft ? root.val:0;
        int l = dfs(root.left, true);
        int r = dfs(root.right, false);
        return l + r;
    }
}
