package org.example.word_search;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean exist(char[][] board, String word) {
        Set<AbstractMap.SimpleEntry <Integer, Integer>> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, set, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, Set<AbstractMap.SimpleEntry <Integer, Integer>> set, int row, int col, String target, int ind) {
        if (ind == target.length())
            return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || target.charAt(ind) != board[row][col]
                || set.contains(new AbstractMap.SimpleEntry<>(row, col)))
            return false;
        set.add(new AbstractMap.SimpleEntry<>(row, col));
        boolean res = dfs(board, set, row + 1, col, target, ind + 1)
                || dfs(board, set, row - 1, col, target, ind + 1)
                || dfs(board, set, row, col + 1, target, ind + 1)
                || dfs(board, set, row, col - 1, target, ind + 1);
        set.remove(new AbstractMap.SimpleEntry<>(row, col));
        return res;
    }
}
