package org.example.self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();

        while(left<=right) {
            int tl = left;
            if(dv(left)) li.add(left);
            left++;
        }

        return li;
    }

    boolean dv(int num) {
        int t = num;
        while(t>0) {
            if(t%10 == 0 || num%(t%10)!=0) return false;
            t = t/10;

        }

        return true;
    }
}