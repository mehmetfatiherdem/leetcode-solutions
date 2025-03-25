package org.example.repeated_substring_pattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int slen = s.length();

        for(int i = 1; i<=slen/2; i++) {
            if(slen%i == 0) {
                String t = s.substring(0, i);
                StringBuilder r = new StringBuilder();
                for(int j = 0; j < slen/i; j++) {
                    r.append(t);
                }
                if(s.equals(r.toString())) return true;
            }
        }

        return false;

    }
}
