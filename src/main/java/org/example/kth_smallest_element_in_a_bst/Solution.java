package org.example.kth_smallest_element_in_a_bst;
import org.example.data_structures.TreeNode;
import java.util.Stack;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> st = new Stack<>();
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            if(--k == 0) return root.val;
            root = root.right;
        }

        return -1;
    }
}
