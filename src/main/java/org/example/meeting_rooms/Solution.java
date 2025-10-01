package org.example.meeting_rooms;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Solution {

    public class Interval {
      public int start, end;
      public Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
    }
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty()) return true;
        Comparator<Interval> intcom = Comparator.comparingInt((Interval i) -> i.start);
        Collections.sort(intervals, intcom);
        Interval prev = intervals.get(0);
        for(int i = 1; i<intervals.size(); i++) {
            if(intervals.get(i).start < prev.end) return false;
            prev = intervals.get(i);
        }

        return true;
    }
}
