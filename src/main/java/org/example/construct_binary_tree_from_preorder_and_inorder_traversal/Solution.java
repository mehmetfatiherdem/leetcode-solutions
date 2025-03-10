package org.example.construct_binary_tree_from_preorder_and_inorder_traversal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) return null;

        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, hm);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int[] inorder, int inStart, int inEnd,
                           Map<Integer, Integer> hm) {
        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int mid = hm.get(preorder[preStart]);
        int leftSize = mid - inStart;

        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, mid - 1, hm);
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                inorder, mid + 1, inEnd, hm);

        return root;
    }
}
