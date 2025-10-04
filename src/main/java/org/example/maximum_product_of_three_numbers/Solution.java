package org.example.maximum_product_of_three_numbers;

public class Solution {
    public int maximumProduct(int[] nums) {
        long l1 = Long.MAX_VALUE;
        long l2 = Long.MAX_VALUE;
        long m1 = Long.MIN_VALUE, m2 = Long.MIN_VALUE, m3 = Long.MIN_VALUE;

        for(long n: nums) {
            if(n>m1) {
                m3 = m2;
                m2 = m1;
                m1 = n;
            } else if(n>m2) {
                m3 = m2;
                m2 = n;
            } else if(n>m3) {
                m3 = n;
            }
        }

        for(long n: nums) {
            if(n<l1) {
                l2 = l1;
                l1 = n;
            } else if(n<l2) {
                l2 = n;
            }
        }


        long r = m1*m2*m3;
        long l = l1*l2*m1;
        return Math.max((int)r,(int)l);
    }
}
