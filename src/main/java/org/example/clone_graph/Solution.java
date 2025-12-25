package org.example.clone_graph;

import org.example.data_structures.GraphNode;

public class Solution {

    public GraphNode cloneGraph(GraphNode node) {
        if(node == null) return null;
        GraphNode copy = new GraphNode(node.val);
        GraphNode[] visited = new GraphNode[101];
        dfs(node, copy, visited);
        return copy;
    }

    public void dfs(GraphNode node , GraphNode copy , GraphNode[] visited){
        visited[copy.val] = copy;
        for(GraphNode n: node.neighbors) {
            if(visited[n.val] == null) {
                GraphNode nn = new GraphNode(n.val);
                copy.neighbors.add(nn);
                dfs(n, nn, visited);
            } else {
                copy.neighbors.add(visited[n.val]);
            }
        }
    }
}
