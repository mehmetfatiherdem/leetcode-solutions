package org.example.number_of_segments_in_a_string;

public class Solution {
    public int countSegments(String s) {
        if(s.isEmpty() || s==null) return 0;
        int cnt = 0;
        int i = 0;
        while(i<s.length()) {
            if(i>0 && s.charAt(i-1) != ' ' && s.charAt(i) == ' ') {
                cnt++;
            }
            i++;

        }

        if(s.charAt(i-1) != ' ') cnt++;

        return cnt;
    }
}
