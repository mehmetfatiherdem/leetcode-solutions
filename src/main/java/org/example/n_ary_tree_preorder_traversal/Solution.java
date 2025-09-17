package org.example.n_ary_tree_preorder_traversal;

import org.example.data_structures.NaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorder(NaryTree root) {
        List<Integer> li = new ArrayList<>();
        if(root == null) return li;

        po(root, li);

        return li;
    }

    void po(NaryTree root, List<Integer> li) {
        if(root == null) return;
        li.add(root.val);
        for(NaryTree c: root.children) {
            po(c, li);
        }
    }
}
