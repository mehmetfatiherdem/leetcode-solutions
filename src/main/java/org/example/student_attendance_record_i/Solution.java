package org.example.student_attendance_record_i;

public class Solution {
    public boolean checkRecord(String s) {
        int ac = 0, lc = 0, cc = 0;
        for(char c: s.toCharArray()) {
            if(c == 'A') {
                ac++;
                cc = 0;
            }
            else if(c == 'L') {
                cc++;

            } else {
                cc = 0;
            }
            lc = Math.max(lc,cc);
        }
        return ac<2 & lc<3;
    }
}
