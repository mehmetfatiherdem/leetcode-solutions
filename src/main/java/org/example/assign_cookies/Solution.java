package org.example.assign_cookies;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        int i = 0, j = 0;
        while(i<g.length && j<s.length) {
            if(s[j]>=g[i]) {
                sum++;
                j++;
                i++;
            }
            else {
                j++;
            }
        }
        return sum;
    }
}
