package org.example.trapping_rain_water;

public class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lp = 0;
        int rp = n-1;
        int lmax = height[lp], rmax = height[rp];
        int sum = 0;
        while(lp<rp) {
            if(lmax>rmax) {
                rmax = Math.max(rmax, height[--rp]);
                sum+=rmax-height[rp];
            } else {
                lmax = Math.max(lmax, height[++lp]);
                sum+=lmax-height[lp];
            }
        }

        return sum;
    }
}
