package org.example.to_lower_case;

public class Solution {
    public String toLowerCase(String s) {
        char[] car = s.toCharArray();
        for(int i = 0; i<car.length; i++) {
            if(car[i]>='A' && car[i]<='Z') {
                car[i] = (char)('a'+(car[i]-'A'));
            }

        }
        return new String(car);
    }
}
