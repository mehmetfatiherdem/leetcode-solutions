package org.example.two_sum_iv_Input_is_a_bst;

import org.example.data_structures.TreeNode;

public class Solution {
    public boolean findTarget(TreeNode root, int k) {

        return x(root,root,k);
    }

    boolean x(TreeNode n, TreeNode r , int k) {
        if(n == null) return false;
        int diff = k-n.val;

        if(n.val<diff) {
            if(search(r.right, diff, n)) return true;
        }else if(n.val>diff) {
            if(search(r.left, diff, n)) return true;
        }

        return x(n.left, r, k) || x(n.right, r, k);
    }

    boolean search(TreeNode n, int target, TreeNode in) {
        while(n != null) {
            if(n.val == target && n != in) return true;
            n = target < n.val ? n.left:n.right;
        }
        return false;
    }
}
