package org.example.reshape_the_matrix;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int cells = mat.length*mat[0].length;
        if(r*c != cells) return mat;
        if(r == mat.length && c == mat[0].length) return mat;
        int[][] res = new int[r][c];
        int cn = 0;
        for(int i = 0; i<mat.length; i++) {
            for(int j = 0; j<mat[i].length; j++) {
                res[cn/c][cn%c] = mat[i][j];
                cn++;
            }
        }

        return res;
    }
}
