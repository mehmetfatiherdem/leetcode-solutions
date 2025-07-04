package org.example.koko_eating_bananas;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = piles[0];
        for(int num: piles)
            if(num>max) max = num;
        int res = max;
        while(min<=max) {
            int mid = min+(max-min)/2;

            if(succeed(mid, piles, h)) {
                res = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return res;
    }

    public boolean succeed(int rate, int[] piles, int h) {
        long hours = 0;
        for (int num : piles) {
            hours += (num + rate - 1) / rate;
        }
        return hours <= h;
    }
}
