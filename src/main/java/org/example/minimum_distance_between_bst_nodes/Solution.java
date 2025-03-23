package org.example.minimum_distance_between_bst_nodes;

import org.example.data_structures.TreeNode;

public class Solution {
    TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {

        inOrderTraversal(root);
        return minDiff;
    }

    void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev.val);
        }

        prev = node;

        inOrderTraversal(node.right);
    }
}
