package org.example.unique_paths;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int y = 0; y < m; y++) {
            dp[y][0] = 1;
        }
        for(int x = 0; x < n; x++) {
            dp[0][x] = 1;
        }

        for(int i = 1; i<m; i++) {
            for(int j = 1; j<n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
