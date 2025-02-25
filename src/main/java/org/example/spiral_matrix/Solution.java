package org.example.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    enum Direction{
        UP, RIGHT, DOWN, LEFT
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int u = 0, r = matrix[0].length, d = matrix.length, l = 0;
        Direction currDir = Direction.RIGHT;
        List<Integer> li = new ArrayList<>();

        int cnt = 0, row = 0, col = 0;
        while(li.size()<(matrix.length * matrix[0].length)) {
            switch(currDir) {
                case UP:
                    for(int i = d-1; i>=u; i--) {
                        li.add(matrix[i][col]);
                    }
                    row = u;
                    col = l;
                    l++;
                    currDir = Direction.RIGHT;
                    break;

                case RIGHT:
                    for(int i = l; i<r; i++) {
                        li.add(matrix[row][i]);
                    }
                    row = u;
                    col = r-1;
                    u++;
                    currDir = Direction.DOWN;
                    break;

                case DOWN:
                    for(int i = u; i<d; i++) {
                        li.add(matrix[i][col]);
                    }
                    row = d-1;
                    col = r-1;
                    r--;
                    currDir = Direction.LEFT;
                    break;

                case LEFT:
                    for(int i = r-1; i>=l; i--) {
                        li.add(matrix[row][i]);
                    }
                    row = d-1;
                    col = l;
                    d--;
                    currDir = Direction.UP;
                    break;
            }
        }

        return li;
    }
}
