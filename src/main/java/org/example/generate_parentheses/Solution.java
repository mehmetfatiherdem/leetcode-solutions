package org.example.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        helper(li, "", 0, 0, n);
        return li;
    }

    void helper(List<String> li, String curr, int openN, int closedN, int n) {
        if(curr.length() == 2*n) {
            li.add(curr);
            return;
        }
        if(openN<n) {
            helper(li, curr + "(", openN+1, closedN, n);
        }
        if(openN>closedN) {
            helper(li, curr + ")", openN, closedN+1, n);
        }
    }
}
