package org.example.is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length(), tlen = t.length();
        int i = 0;
        int j = 0;
        while(i<slen && j<tlen) {
            if(s.charAt(i) != t.charAt(j)) {
                j++;
            } else if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
        }

        return i == slen;
    }
}
