package org.example.non_overlapping_intervals;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 1) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[1]));
        int pend = intervals[0][1];
        int c = 0;
        for(int i = 1; i<intervals.length; i++) {
            if(pend > intervals[i][0]) {
                c++;
            } else {
                pend = intervals[i][1];
            }

        }

        return c;
    }
}
