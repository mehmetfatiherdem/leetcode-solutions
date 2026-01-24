package org.example.binary_tree_maximum_path_sum;
import org.example.data_structures.TreeNode;

public class Solution {
    int res = Integer.MIN_VALUE ;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int lmax = dfs(root.left);
        int rmax = dfs(root.right);
        lmax = Math.max(lmax, 0);
        rmax = Math.max(rmax, 0);
        res = Math.max(res, root.val + lmax + rmax);
        return root.val + Math.max(lmax, rmax);
    }
}
