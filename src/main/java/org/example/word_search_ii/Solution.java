package org.example.word_search_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    class Trie {
        Trie[] children;
        String word;

        public Trie() {
            children = new Trie[26];
            word = null;
        }

        public void addWord(String word) {
            Trie node = this;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.word = word;
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        Trie root = new Trie();
        for (String word : words) {
            root.addWord(word);
        }

        List<String> result = new ArrayList<>();
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, root, visited, result);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int row, int col, Trie node, boolean[][] visited, List<String> result) {

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length ||
                visited[row][col]) {
            return;
        }

        char currentChar = board[row][col];
        int index = currentChar - 'a';

        if (node.children[index] == null) {
            return;
        }

        node = node.children[index];

        // If we found a word
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // Prevent duplicates
        }

        visited[row][col] = true;

        dfs(board, row - 1, col, node, visited, result);
        dfs(board, row + 1, col, node, visited, result);
        dfs(board, row, col - 1, node, visited, result);
        dfs(board, row, col + 1, node, visited, result);

        visited[row][col] = false;
    }
}
