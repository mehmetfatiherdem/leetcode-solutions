package org.example.base_7;

public class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int t = num;
        int r;
        if(num<0) t = t*(-1);
        while(t > 0) {
            r = t%7;
            t = t/7;
            sb.append(r);

        }

        if(num<0) sb.append("-");

        return sb.reverse().toString();
    }
}
