package org.example.set_matrix_zeroes;

public class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length, cols = matrix[0].length;
        boolean rowZero = false;

        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    if(i > 0) matrix[i][0] = 0;
                    else rowZero = true;
                }
            }
        }

        for(int i = 1; i<matrix.length; i++) {
            for(int j = 1; j<matrix[0].length; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int i = 0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if(rowZero) {
            for(int j = 0; j<matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

    }
}
