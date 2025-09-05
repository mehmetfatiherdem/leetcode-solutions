package org.example.remove_k_digits;

import java.util.Stack;

public class Solution {
    public String removeKdigits(String num, int k) {
        int slen = num.length();
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<slen; i++) {
            char c = num.charAt(i);
            while(!s.isEmpty() && k>0 && c<s.peek()) {
                s.pop();
                k--;
            }

            s.push(c);
        }

        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }

        while(!s.isEmpty()) {
            sb.append(s.pop());
        }

        sb.reverse();

        while(!sb.isEmpty() && sb.charAt(0)=='0') sb.deleteCharAt(0);
        return !sb.isEmpty() ? sb.toString() : "0";
    }
}
