package org.example.insert_interval;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        int ns = newInterval[0];
        int ne = newInterval[1];

        while (i < n && intervals[i][1] < ns) {
            result.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= ne) {
            ns = Math.min(ns, intervals[i][0]);
            ne = Math.max(ne, intervals[i][1]);
            i++;
        }
        result.add(new int[]{ns, ne});

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
