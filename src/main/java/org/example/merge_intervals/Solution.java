package org.example.merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) return new int[][]{{intervals[0][0], intervals[0][1]}};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> l = new ArrayList<>();
        int i = 1, n = intervals.length;
        int[] prev = intervals[0];
        int lb, ub;
        while(i<n) {
            if(prev[1]<intervals[i][0]) {
                l.add(new int[]{prev[0], prev[1]});
                prev = intervals[i];
                i++;
            } else {
                lb = Math.min(prev[0], intervals[i][0]);
                ub = Math.max(prev[1], intervals[i][1]);
                prev[0] = lb;
                prev[1] = ub;
                i++;
            }

        }

        l.add(prev);

        return l.toArray(new int[l.size()][]);
    }
}
