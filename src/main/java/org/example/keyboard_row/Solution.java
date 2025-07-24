package org.example.keyboard_row;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public String[] findWords(String[] words) {
        List<String> ws = new ArrayList<>();

        Map<Character, Integer> hm = getCharacterIntegerMap();

        for(String s: words) {
            boolean isSame = true;
            int i = hm.get(Character.toLowerCase(s.charAt(0)));
            for(char c: s.toCharArray()) {
                if(hm.get(Character.toLowerCase(c)) != i) {
                    isSame = false;
                }
                if(!isSame) break;
            }
            if(isSame) ws.add(s);
        }
        return ws.toArray(new String[0]);
    }

    private static Map<Character, Integer> getCharacterIntegerMap() {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('q', 1);
        hm.put('w', 1);
        hm.put('e', 1);
        hm.put('r', 1);
        hm.put('t', 1);
        hm.put('y', 1);
        hm.put('u', 1);
        hm.put('i', 1);
        hm.put('o', 1);
        hm.put('p', 1);
        hm.put('a', 2);
        hm.put('s', 2);
        hm.put('d', 2);
        hm.put('f', 2);
        hm.put('g', 2);
        hm.put('h', 2);
        hm.put('j', 2);
        hm.put('k', 2);
        hm.put('l', 2);
        hm.put('z', 3);
        hm.put('x', 3);
        hm.put('c', 3);
        hm.put('v', 3);
        hm.put('b', 3);
        hm.put('n', 3);
        hm.put('m', 3);
        return hm;
    }
}
