package org.example.relative_ranks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] sarr = new String[score.length];

        Map<Integer, String> hm = new HashMap<>();
        int[] ar = Arrays.copyOf(score, score.length);
        Arrays.sort(ar);
        for(int i = 0; i<ar.length; i++) {
            if(i == ar.length-1) hm.put(ar[i], "Gold Medal");
            else if(i == ar.length-2) hm.put(ar[i], "Silver Medal");
            else if(i == ar.length-3) hm.put(ar[i], "Bronze Medal");
            else hm.put(ar[i], Integer.toString(ar.length-i));
        }

        for(int i = 0; i < score.length; i++) {
            sarr[i] = hm.get(score[i]);
        }

        return sarr;
    }
}
