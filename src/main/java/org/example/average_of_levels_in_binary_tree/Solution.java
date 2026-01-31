package org.example.average_of_levels_in_binary_tree;

import org.example.data_structures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode nl = root.left;
        q.add(root);
        double sum = root.val;
        int lnum = 1;
        while(!q.isEmpty()) {
            root = q.poll();
            if(root != nl) {
                sum+=root.val;
                lnum++;
            } else {
                li.add(sum/lnum);
                sum = root.val;
                lnum = 1;
                nl = null;
            }
            if(root.left != null) q.add(root.left);
            if(root.right != null) q.add(root.right);
            if(nl == null) {
                nl = root.left == null ? root.right:root.left;
            }

        }
        li.add(sum/lnum);
        return li;
    }
}
