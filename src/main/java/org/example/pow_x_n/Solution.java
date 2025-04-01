package org.example.pow_x_n;

public class Solution {
    public double myPow(double x, int n) {
        double r = m(x,n);
        return n>0 ? r:1/r;
    }

    double m(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        double res = m(x,n/2);
        if(n%2 == 0) res = res*res;
        else res = res*res*x;
        return res;
    }
}