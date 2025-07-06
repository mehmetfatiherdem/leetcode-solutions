package org.example.search_a_2d_matrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rs = 0, re = matrix.length-1;
        int cs = 0, ce = matrix[0].length-1;
        int ri = rs, rj = re;

        while(ri<=rj) {
            int rm = ri+(rj-ri)/2;
            if(matrix[rm][cs] > target) {
                rj = rm-1;
            } else if(matrix[rm][ce] < target) {
                ri = rm+1;
            } else {
                int ci = cs, cj = ce;
                while(ci<=cj) {
                    int cm = ci+(cj-ci)/2;
                    if(matrix[rm][cm] < target) ci = cm+1;
                    else if(matrix[rm][cm] > target) cj = cm-1;
                    else return true;
                }
                return false;
            }
        }

        return false;
    }
}
