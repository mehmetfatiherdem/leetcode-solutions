package org.example.island_perimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int[] per = {4, 3, 2, 1, 0};
        int sum = 0, nc = 0;
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    if(i-1 >= 0 && grid[i-1][j] == 1) nc++;
                    if(j-1 >= 0 && grid[i][j-1] == 1) nc++;
                    if(i+1 < grid.length && grid[i+1][j] == 1) nc++;
                    if(j+1 < grid[0].length && grid[i][j+1] == 1) nc++;
                    sum+=per[nc];
                    nc = 0;
                }

            }
        }

        return sum;
    }
}
