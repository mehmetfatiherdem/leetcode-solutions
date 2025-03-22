package org.example.longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> s  = new HashSet<>();

        for(int n: nums) {
            s.add(n);
        }
        int max = Integer.MIN_VALUE;
        for(int n: s) {
            if(!s.contains(n-1)) {
                int cnt = 1;
                int t = n+1;
                while(s.contains(t++)) {
                    cnt++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}
