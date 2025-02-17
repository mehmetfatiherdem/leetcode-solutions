package org.example.clone_graph;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node copy = new Node(node.val);
        Node[] visited = new Node[101];
        dfs(node, copy, visited);
        return copy;
    }

    public void dfs(Node node , Node copy , Node[] visited){
        visited[copy.val] = copy;

        for(Node n: node.neighbors) {
            if(visited[n.val] == null) {
                Node nn = new Node(n.val);
                copy.neighbors.add(nn);
                dfs(n, nn, visited);
            } else {
                copy.neighbors.add(visited[n.val]);
            }
        }

    }
}
