package org.example.reverse_words_in_a_string_iii;

public class Solution {
    public String reverseWords(String s) {
        var sar = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String st: sar) {
            StringBuilder sbb = new StringBuilder(st);
            sb.append(sbb.reverse()).append(" ");
        }

        return sb.substring(0, sb.length()-1).toString();
    }
}
