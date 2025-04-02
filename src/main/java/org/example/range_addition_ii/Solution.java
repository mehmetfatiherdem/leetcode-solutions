package org.example.range_addition_ii;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int r = m, c = n;

        for(int i = 0; i<ops.length; i++) {
            r = Math.min(r, ops[i][0]);
            c = Math.min(c, ops[i][1]);
        }

        return r*c;
    }
}
