package org.example.encode_and_decode_strings;

import java.util.List;
import java.util.ArrayList;

public class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s.length()).append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();
        int l = 0;
        char[] car = str.toCharArray();
        int i = 0;
        while(i<car.length) {
            int j = i;
            while(str.charAt(j) != '#') {
                l = l*10;
                l = l+(str.charAt(j++)-'0');
            }

            li.add(str.substring(++j, j+l));
            i = j+l;
            l = 0;
        }

        return li;
    }
}

