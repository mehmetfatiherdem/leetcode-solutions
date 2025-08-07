package org.example.evaluate_reverse_polish_notation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens) {
            switch (s) {
                case "+" -> {
                    int op2 = st.pop();
                    int op1 = st.pop();
                    int res = op1 + op2;
                    st.push(res);
                }
                case "-" -> {
                    int op2 = st.pop();
                    int op1 = st.pop();
                    int res = op1 - op2;
                    st.push(res);
                }
                case "*" -> {
                    int op2 = st.pop();
                    int op1 = st.pop();
                    int res = op1 * op2;
                    st.push(res);
                }
                case "/" -> {
                    int op2 = st.pop();
                    int op1 = st.pop();
                    int res = op1 / op2;
                    st.push(res);
                }
                default -> st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}