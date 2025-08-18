package org.example.serialize_and_deserialize_binary_tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializer(root, sb);
        return sb.toString();
    }

    public void serializer(TreeNode node, StringBuilder sb) {
        if(node == null) {
            sb.append("#,");
            return;
        }
        sb.append(node.val).append(",");
        serializer(node.left, sb);
        serializer(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializer(queue);
    }

    public TreeNode deserializer(Queue<String> queue) {
        String str = queue.poll();
        if(str != null && str.equals("#")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(str));
        node.left = deserializer(queue);
        node.right = deserializer(queue);
        return node;
    }
}
