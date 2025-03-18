package org.example.longest_uncommon_subsequence_i;

public class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1:Math.max(a.length(), b.length());
    }
}
