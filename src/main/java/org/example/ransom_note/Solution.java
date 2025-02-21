package org.example.ransom_note;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];

        for(char m: magazine.toCharArray()) {
            a[m-'a']++;
        }

        for(char r: ransomNote.toCharArray()) {
            if(a[r-'a'] == 0) return false;
            a[r-'a']--;
        }

        return true;
    }
}
