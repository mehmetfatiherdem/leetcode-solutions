package org.example.minimum_bit_flips_to_convert_number;

public class Solution {
    public int minBitFlips(int start, int goal) {
        int exory = start^goal;
        int c = 0;
        for(int i = 0; i<32; i++) {
            int s = exory>>i;
            if((s&1)==1) c++;
        }
        return c;
    }
}
