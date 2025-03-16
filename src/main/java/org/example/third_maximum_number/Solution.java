package org.example.third_maximum_number;

public class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null, smax = null, tmax = null;

        for (Integer n : nums) {
            if (n.equals(max) || n.equals(smax) || n.equals(tmax)) continue;

            if (max == null || n > max) {
                tmax = smax;
                smax = max;
                max = n;
            } else if (smax == null || n > smax) {
                tmax = smax;
                smax = n;
            } else if (tmax == null || n > tmax) {
                tmax = n;
            }
        }

        return tmax == null ? max : tmax;
    }
}
