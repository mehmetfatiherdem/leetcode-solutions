package org.example.lowest_common_ancestor_of_a_binary_search_tree;

import org.example.data_structures.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((p.val <= root.val && q.val >= root.val) || (q.val <= root.val && p.val >= root.val)) {
            return root;
        } else if(p.val<root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return lowestCommonAncestor(root.right, p, q);
    }
}
