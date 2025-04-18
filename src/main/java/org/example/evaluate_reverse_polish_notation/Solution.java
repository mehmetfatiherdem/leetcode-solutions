package org.example.evaluate_reverse_polish_notation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens) {
            if(s.equals("+")) {
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1+op2;
                st.push(res);
            } else if(s.equals("-")) {
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1-op2;
                st.push(res);
            } else if(s.equals("*")) {
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1*op2;
                st.push(res);
            } else if(s.equals("/")) {
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1/op2;
                st.push(res);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}