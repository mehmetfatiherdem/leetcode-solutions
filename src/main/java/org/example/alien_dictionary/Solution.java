package org.example.alien_dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    // Enum or constants for visited states for clarity
    private static final int UNVISITED = 0;
    private static final int VISITING = 1;
    private static final int VISITED = 2;

    public String foreignDictionary(String[] words) {

        // 1. Initialize the Adjacency List and find all unique characters
        Map<Character, Set<Character>> adj = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                // Initialize entry for each character if not present
                adj.putIfAbsent(c, new HashSet<>());
            }
        }

        // 2. Build the Graph (find edges/dependencies)
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int minLen = Math.min(w1.length(), w2.length());

            // Check for the invalid prefix case: "abc" before "ab" is impossible
            if (w1.length() > w2.length() && w1.substring(0, minLen).equals(w2.substring(0, minLen))) {
                return ""; // Invalid order
            }

            // Find the first differing character to establish an edge
            for (int j = 0; j < minLen; j++) {
                char char1 = w1.charAt(j);
                char char2 = w2.charAt(j);
                if (char1 != char2) {
                    // Add edge char1 -> char2 (char1 must come before char2)
                    // Only add if the edge doesn't already exist (optional but good practice)
                    if (!adj.get(char1).contains(char2)) {
                        adj.get(char1).add(char2);
                    }
                    break; // Found the first difference, move to the next word pair
                }
            }
        }

        // 3. Perform Topological Sort using DFS
        Map<Character, Integer> visitedState = new HashMap<>(); // 0: unvisited, 1: visiting, 2: visited
        StringBuilder result = new StringBuilder(); // Stores the result in reverse order initially

        // Initialize visited states for all known characters
        for (char c : adj.keySet()) {
            visitedState.put(c, UNVISITED);
        }

        // Iterate through all unique characters and start DFS if unvisited
        for (char c : adj.keySet()) {
            if (visitedState.get(c) == UNVISITED) {
                if (dfs(c, visitedState, adj, result)) {
                    // Cycle detected
                    return "";
                }
            }
        }

        // 4. Reverse the result to get the correct topological order
        return result.reverse().toString();
    }

    boolean dfs(char node, Map<Character, Integer> visitedState, Map<Character, Set<Character>> adj, StringBuilder result) {
        // Mark the current node as visiting
        visitedState.put(node, VISITING);

        // Visit all neighbors
        if (adj.containsKey(node)) { // Check if the node exists as a key (it might be a leaf node with no outgoing edges)
            for (char neighbor : adj.get(node)) {
                int neighborState = visitedState.getOrDefault(neighbor, UNVISITED); // Handle potential neighbors not explicitly in keyset if words only contain them at the end.

                if (neighborState == VISITING) {
                    // Cycle detected: found a node currently in the recursion stack
                    return true;
                }
                if (neighborState == UNVISITED) {
                    // Recursively call DFS on unvisited neighbors
                    if (dfs(neighbor, visitedState, adj, result)) {
                        // Propagate cycle detection result up
                        return true;
                    }
                }
                // If neighborState is VISITED, do nothing - already processed
            }
        }


        // Mark the current node as fully visited
        visitedState.put(node, VISITED);
        // Append the node to the result (post-order traversal)
        result.append(node);

        // No cycle detected from this path
        return false;
    }
}
