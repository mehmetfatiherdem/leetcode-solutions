package org.example.number_of_islands;

public class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        if(grid == null) return 0;

        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j<grid[i].length; j++) {
                if(grid[i][j] == '1') cnt++;
                dfs(i,j,grid);
            }
        }

        return cnt;
    }

    void dfs(int i, int j, char[][] grid) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j] != '1') return;
        if(grid[i][j] == '1') grid[i][j] = '#';

        dfs(i+1, j, grid);
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
    }
}
