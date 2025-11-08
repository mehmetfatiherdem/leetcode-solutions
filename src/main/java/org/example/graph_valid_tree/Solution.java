package org.example.graph_valid_tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;
        if(edges.length == 0) return true;
        boolean[] visited = new boolean[n];

        List<List<Integer>> adj = new ArrayList<>(edges.length);
        for(int i = 0; i<n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        if(!dfs(0,0,adj,visited)) return false;

        for (boolean visit : visited) {
            if (!visit) return false;
        }

        return true;
    }

    boolean dfs(int prev, int num,  List<List<Integer>> adj, boolean[] visited) {

        visited[num] = true;

        for(int n: adj.get(num)) {
            if(prev == n) continue;
            if(visited[n]) return false;
            if(!dfs(num,n, adj, visited)) return false;
        }

        return true;
    }
}

