package org.example.number_of_connected_components_in_an_undirected_graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        for(int i = 0; i<n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] li: edges) {
            adj.get(li[0]).add(li[1]);
            adj.get(li[1]).add(li[0]);

        }

        int c = 0;

        for(int i = 0; i<n; i++) {
            if(!visited.contains(i)) {
                dfs(i, adj, visited);
                c++;
            }
        }

        return c;
    }

    void dfs(int num, List<List<Integer>> adj, Set<Integer> visited) {

        if(visited.contains(num)) return;
        visited.add(num);

        for(int neigh: adj.get(num)) {
            dfs(neigh, adj, visited);
        }

    }
}

