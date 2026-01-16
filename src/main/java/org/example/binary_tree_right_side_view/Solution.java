package org.example.binary_tree_right_side_view;

import org.example.data_structures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);

        while(!qu.isEmpty()) {
            root = qu.poll();

            if(root.left != null) qu.add(root.left);
            if(root.right != null) qu.add(root.right);

            if(qu.peek() == null) {
                list.add(root.val);
                qu.poll();
                if(!qu.isEmpty()) qu.add(null);
            }
        }
        return list;
    }
}