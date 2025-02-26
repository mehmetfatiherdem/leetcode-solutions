package org.example.valid_perfect_square;

public class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0, r = num;

        while(l<=r) {
            long mid = l + (r-l)/2;
            if(mid*mid > num) {
                r = mid-1;
            } else if(mid*mid < num) {
                l = mid+1;
            } else {
                return true;
            }
        }

        return false;
    }
}
