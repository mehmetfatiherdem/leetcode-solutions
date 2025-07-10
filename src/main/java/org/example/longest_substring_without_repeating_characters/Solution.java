package org.example.longest_substring_without_repeating_characters;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;

        HashMap<Character, Integer> hm = new HashMap<>(){{
            put(s.charAt(0), 0);
        }};
        int beg = 1, end = 1;
        int lmax = 1, l = 1;

        while(end < s.length()) {
            Character c = s.charAt(end);
            Integer ind = hm.get(c);

            if(ind == null) {
                hm.put(c, end++);
                l++;
                if(l > lmax) lmax = l;
            } else {
                beg = ind + 1;
                end = beg;
                l = 0;
                hm.clear();
            }
        }


        return lmax;

    }
}
