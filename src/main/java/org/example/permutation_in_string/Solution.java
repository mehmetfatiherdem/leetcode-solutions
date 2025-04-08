package org.example.permutation_in_string;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] p = new int[26];
        int[] q = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            p[s1.charAt(i)-'a']++;
            q[s2.charAt(i)-'a']++;
        }

        for(int i = 0; i<s2.length()-s1.length(); i++) {
            if (matches(p, q)) return true;
            q[s2.charAt(i)-'a']--;
            q[s2.charAt(i+s1.length())-'a']++;
        }

        return matches(p, q);
    }

    boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}
