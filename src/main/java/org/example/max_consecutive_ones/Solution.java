package org.example.max_consecutive_ones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxo = 0, curmax = 0;
        for(int n: nums) {
            if(n == 1) curmax++;
            else {
                maxo = Math.max(maxo, curmax);
                curmax = 0;
            }
        }

        return Math.max(maxo, curmax);
    }
}
