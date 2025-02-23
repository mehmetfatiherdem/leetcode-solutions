package org.example.hamming_distance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int exory = x^y;
        int c = 0;
        for(int i = 0; i<32; i++) {
            int s = exory>>i;
            if((s&1)==1) c++;
        }
        return c;
    }
}
