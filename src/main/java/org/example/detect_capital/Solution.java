package org.example.detect_capital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allCap = false, allLow = true;
        boolean onlyFirstCap = false;

        if(Character.isUpperCase(word.charAt(0))) {
            onlyFirstCap = true;
            allLow = false;
            allCap = true;
        }
        for(int i = 1; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                onlyFirstCap = false;
                allLow = false;
            } else allCap = false;

        }
        return allCap || allLow || onlyFirstCap;
    }
}
