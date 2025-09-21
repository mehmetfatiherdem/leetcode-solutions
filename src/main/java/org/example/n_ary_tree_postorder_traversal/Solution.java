package org.example.n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;
import org.example.data_structures.NaryTree;

public class Solution {

    public List<Integer> postorder(NaryTree root) {
        List<Integer> li = new ArrayList<>();
        if(root == null) return li;
        po(root, li);
        li.add(root.val);
        return li;
    }

    void po(NaryTree root, List<Integer> li) {
        if(root == null) return;

        for(NaryTree n: root.children) {
            po(n, li);
            li.add(n.val);
        }
    }
}
