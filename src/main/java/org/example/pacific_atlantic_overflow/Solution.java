package org.example.pacific_atlantic_overflow;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {

    public void dfs(int row, int col, int rows, int cols, boolean[][] visited, int prevHeight, int[][] heights) {
        if(row<0 || col<0  || row==rows || col==cols || visited[row][col] ||
                heights[row][col] < prevHeight)
            return;
        visited[row][col] = true;

        dfs(row+1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row-1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row, col+1, rows, cols, visited, heights[row][col], heights);
        dfs(row, col-1, rows, cols, visited, heights[row][col], heights);
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rows = heights.length, cols = heights[0].length;

        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];

        for(int i = 0; i<cols; i++) {
            dfs(0, i, rows, cols, pac, heights[0][i], heights);
            dfs(rows-1, i, rows, cols, atl, heights[rows-1][i], heights);
        }

        for(int k = 0; k<rows; k++) {
            dfs(k, 0, rows, cols, pac, heights[k][0], heights);
            dfs(k, cols-1, rows, cols, atl, heights[k][cols-1], heights);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pac[r][c] && atl[r][c]) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }

        return res;

    }
}
