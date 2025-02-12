package org.example.House_Robber;

public class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+2];

        for(int i = 0; i<nums.length; i++) {
            int max = 0;
            for(int j = 0; j<i+1; j++) {
                max = Math.max(max, dp[j]);
            }
            dp[i+2] = nums[i] + max;
        }
        int robm = 0;
        for(int d: dp) {
            if(d > robm) robm = d;
        }

        return robm;
    }
}
