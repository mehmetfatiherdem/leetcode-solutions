package org.example.data_structures;

public class TreeNode {
    public int val;
    public TreeNode right;
    public TreeNode left;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode right, TreeNode left) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
