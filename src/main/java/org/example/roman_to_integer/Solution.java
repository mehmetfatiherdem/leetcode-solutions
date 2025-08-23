package org.example.roman_to_integer;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }

        HashMap<Character, Integer> rome = new HashMap<>();
        rome.put('I', 1);
        rome.put('V', 5);
        rome.put('X', 10);
        rome.put('L', 50);
        rome.put('C', 100);
        rome.put('D', 500);
        rome.put('M', 1000);

        int sum = rome.get(s.charAt(s.length()-1));


        for(int i = s.length()-1; i>0; i--){
            if(rome.get(s.charAt(i-1)) >= rome.get(s.charAt(i))){
                sum += rome.get(s.charAt(i-1));
            }else{
                sum -= rome.get(s.charAt(i-1));
            }
        }

        return sum;
    }
}
