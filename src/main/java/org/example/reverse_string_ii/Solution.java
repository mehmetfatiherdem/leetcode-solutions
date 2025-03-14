package org.example.reverse_string_ii;

public class Solution {
    public String reverseStr(String s, int k) {
        int slen = s.length();
        char[] st = s.toCharArray();
        for(int i = 0; i<slen; i+=(2*k)) {
            int left = i;
            int right = Math.min(i+k-1, slen-1);
            while(left<right) {
                char t = st[left];
                st[left] = st[right];
                st[right] = t;
                left++;
                right--;
            }
        }

        return new String(st);

    }
}
