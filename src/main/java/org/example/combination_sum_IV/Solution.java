package org.example.combination_sum_IV;

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;

        for(int i = 1; i <= target; i++) {
            for(int j = 0; j < nums.length; j++) {
                int num = nums[j];
                if(i - num >= 0) {
                    dp[i] += dp[i-num];
                }
            }
        }

        return dp[target];
    }
}
