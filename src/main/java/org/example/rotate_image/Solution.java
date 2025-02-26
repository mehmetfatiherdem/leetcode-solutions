package org.example.rotate_image;

public class Solution {
    public void rotate(int[][] matrix) {
        int edgeLength = matrix.length, top = 0, bottom = matrix.length-1;

        while(top < bottom) {
            for(int col = 0; col < edgeLength; col++) {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }

        for(int row = 0; row<edgeLength; row++) {
            for(int col = row+1; col<edgeLength; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}
