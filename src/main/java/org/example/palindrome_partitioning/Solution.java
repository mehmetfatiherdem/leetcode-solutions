package org.example.palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), 0, s);
        return list;
    }

    public void backtrack(List<List<String>> list, List<String> tempList, int start, String s) {
        if(start == s.length()) {
            list.add(new ArrayList<>(tempList));
            return;
        } else {
            for(int i = start; i<s.length(); i++) {
                if(isPalindrome(s, start, i)) {
                    tempList.add(s.substring(start, i+1));
                    backtrack(list, tempList, i+1, s);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

    public boolean isPalindrome(String s, int low, int high) {
        while(low<high) {
            if(s.charAt(low++) != s.charAt(high--)) return false;
        }

        return true;
    }
}
