package org.example.complement_of_base_10_integer;

public class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int bitLength = Integer.toBinaryString(n).length();
        return n ^ ((1<<bitLength)-1);
    }
}
