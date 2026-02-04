package org.example.arranging_coins;

public class Solution {
    public int arrangeCoins(int n) {
        if(n == 1) return 1;
        long sum;
        long m;
        long l = 0, r = n;
        while(l<=r) {
            m = l+(r-l)/2;
            sum = m*(m+1)/2;
            if(sum > n) {
                r = m-1;
            } else if(sum<n) {
                l = m+1;
            } else {
                return (int)m;
            }
        }
        return (int)r;
    }
}
