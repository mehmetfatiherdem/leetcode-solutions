package org.example.valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        Stack <Character> para = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                para.push(c);
            }else if( c == ')' && !para.isEmpty() && para.peek() == '(' ){
                para.pop();
            }else if( c == '}' && !para.isEmpty() && para.peek() == '{' ){
                para.pop();
            }else if( c == ']' && !para.isEmpty() &&  para.peek() == '[' ){
                para.pop();
            }else{
                return false;
            }


        }
        return para.isEmpty();
    }
}
