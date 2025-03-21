package org.example.search_in_a_binary_search_tree;

import org.example.data_structures.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;
        if(root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}