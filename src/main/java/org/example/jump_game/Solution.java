package org.example.jump_game;

public class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        boolean canJump = false;
        int m = 1;
        int s = 0;
        for(int i = nums.length-1-m; i >= 0; i--) {
            if(nums[i] >= m) {
                m = 1;
                s += nums[i];
                if(i == 0) canJump = true;
                continue;
            }
            m++;
        }

        return canJump && s >= nums.length-1;
    }
}
