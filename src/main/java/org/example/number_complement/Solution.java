package org.example.number_complement;

public class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;
        int bitLength = Integer.toBinaryString(num).length();
        return num ^ ((1<<bitLength)-1);
    }
}
