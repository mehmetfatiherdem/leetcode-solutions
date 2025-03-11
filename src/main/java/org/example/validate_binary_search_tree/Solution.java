package org.example.validate_binary_search_tree;

import org.example.data_structures.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean isValid(TreeNode root, long min, long max) {
        if(root == null) return true;
        if(max <= root.val || min >= root.val) return false;
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
