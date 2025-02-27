package org.example.guess_number_higher_or_lower;

public class Solution {
    int pick;
    public int guessNumber(int n) {
        int l = 0, r = n;
        while(l<=n) {
            int mid = l + (r-l)/2;
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == -1)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }
    public int guess(int num) {
        if(num > pick) return -1;
        if(num < pick) return 1;
        return 0;
    }
}
