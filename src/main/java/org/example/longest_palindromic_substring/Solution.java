package org.example.longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        String st = "";
        int slen = s.length();
        int maxlen = 0;
        for(int i = 0; i<slen; i++) {
            int l = i, r = i;
            while(l>=0 && r<slen && s.charAt(l) == s.charAt(r)) {
                if(r-l+1 > maxlen) {
                    st = s.substring(l, r+1);
                    maxlen = r-l+1;
                }
                l--;
                r++;
            }

            l = i;
            r = i+1;
            while(l>=0 && r<slen && s.charAt(l) == s.charAt(r)) {
                if(r-l+1 > maxlen) {
                    st = s.substring(l, r+1);
                    maxlen = r-l+1;
                }
                l--;
                r++;
            }
        }

        return st;
    }
}
