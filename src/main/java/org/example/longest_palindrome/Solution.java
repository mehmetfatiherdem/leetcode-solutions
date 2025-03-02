package org.example.longest_palindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int cnt = 0;
        boolean hasOdd = false;

        for (int value : freq.values()) {
            if (value % 2 == 0) {
                cnt += value;
            } else {
                cnt += value - 1;
                hasOdd = true;
            }
        }

        return hasOdd ? cnt + 1 : cnt;
    }
}
